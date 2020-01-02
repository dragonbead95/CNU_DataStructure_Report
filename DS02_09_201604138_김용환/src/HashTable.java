import java.util.*;
public class HashTable {
	private Entry[] entries;						// 해시 테이블 배열 공간
	private int size, used, collisionCount;			// 해쉬테이블의 갯수, 사용 갯수, 충돌 횟수 변수
	private float loadFactor;						// 적재율 변수
	private final Entry NIL = new Entry(null,null);	// 더미 공간
	
	public HashTable(int capacity, float loadFactor)
	{
		entries = new Entry[capacity];	// 해시 테이블의 크기
		this.loadFactor = loadFactor; 	// 해쉬 테이블의 적재율(0.75F)
	}
		
	// 내부 클래스
	private class Entry{
		Object key, value;	// 키값, Country 객체 값
		
		Entry(Object k,Object v)
		{
			key = k;
			value = v;
		}
	}
	
	public Object get(Object key)
	{
		int h = hash(key);		// key값을 통해 hash 값을 찾는다.
		
		if(h == -1)				// 해쉬값이 -1이면 null 반환
			return null;
		
		// entries 해쉬 테이블을 해쉬 값들을 탐색한다.
		for(int i=0;i<entries.length;i++)
		{
			int j = nextProbe(h,i);		// 다음 위치 값을 찾는다.
			Entry entry = entries[j];	// 임시 변수에 해쉬 테이블 값을 넣는다.
			
			if(entry==null) 
				break;
			
			if(entry.key.equals(key)) // 찾고자 하는 key값과 동일하면 entry의 객체값을 반환한다.
			{
				System.out.println("[DEBUG] get, " + j);	// 해쉬 테이블에서의 찾은 위치
				return entry.value;
			}
			System.out.println("[DEBUG] Hash Collision, get " + j);	// 해쉬 테이블에서 충돌한 위치
		}
		return null;	// 탐색 실패
	}
	
	public Object put(Object key, Object value)
	{
		if(used>loadFactor*entries.length) {	// 사용된 갯수가 적재율보다 크면 rehash()를 한다.
			rehash();
		}
		int h = hash(key);	// 해쉬 값을 저장한다.
		
		if(h == -1)			
			return null;
		
		// 해쉬 테이블의 해쉬 값들을 탐색한다.
		for(int i=0;i<entries.length;i++)
		{
			int j = nextProbe(h,i);		// 충돌이 일어나면 다음 해쉬값을 찾는다.
			Entry entry = entries[j];	// 임시변수에 해쉬 값을 저장한다.
			
			if(entry==null)	// 해쉬 테이블에 공간이 있으면 삽입
			{
				System.out.println("[DEBUG] put, " + j);	// 해쉬 테이블에 넣을 위치값
				entries[j] = new Entry(key,value);			// 키값과 데이터 삽입
				++size;
				++used;
				return null;
			}
			
			if(entry.key.equals(key)) {		// key값과 비교하여 기존에 키값이 존재한다면 대체한다.
				Object oldvalue = entry.value;
				entries[j].value = value;	// 새로운 데이터 값으로 대체한다.
				return oldvalue;
			}
			System.out.println("[DEBUG] Hash Collision, put, " + j);	// 충돌한 위치			
		}
		return null;	// 삽입 실패
	}
	
	// Key 값을 매개변수로 입력받아 hash 값을 찾는 메소드
	private int hash(Object key)
	{
		if(key==null) throw new IllegalArgumentException();
		
		// key값이 동일한 것을 찾아 해쉬값을 반환한다.
		if(key.equals("KR"))
		{
			return 0;
		}else if(key.equals("FI"))
		{
			return 0;
		}else if(key.equals("IQ"))
		{
			return 1;
		}
		else if(key.equals("IR"))
		{
			return 2;
		}else if(key.equals("SK"))
		{
			return 3;
		}else if(key.equals("CA"))
		{
			return 3;
		}else {
			throw new IllegalArgumentException();
		}
		
	}
	
	// 해쉬 값이 충돌했을 경우 다음 빈공간을 찾기 위한 메소드
	private int nextProbe(int h, int i)
	{
		return (h+i)%entries.length;	// h+i의 값이 해쉬 테이블의 크기와 동일하면 0을 반환한다.
	}
	
	private void rehash()
	{
		Entry[] oldEntries = entries;	// 임시 배열에 해시 테이블 저장
		entries = new Entry[2*oldEntries.length+1];	// 해시 테이블을 2배+1로 늘린다.
													// +1을 하는 이유는 홀수로 만들기 위해서이다.
		
		// 기존 해시테이블을 탐색하며 증가시킨 해시테이블의 자리에 entry를 넣는다.
		for(int k=0;k<oldEntries.length;k++)
		{
			Entry entry = oldEntries[k];	// 임시 entry에 해시테이블 값을 넣는다.
			
			if(entry==null) continue;		// oldEntries[k]가 비었으면 다음 자리를 탐색한다.
			
			int h = hash(entry.key);		// entry의 key 값의 해시값을 찾는다.
			
			// 증가시킨 해시테이블 자리에 넣을 자리를 찾는다.
			for(int i=0;i<entries.length;i++)
			{
				int j = nextProbe(h,i);	// 다음 자리를 찾는 함수
				if(entries[j]==null) // 해시테이블 자리가 비었으면 해당 자리에 entry를 삽입한다.
				{
					entries[j] = entry;
					break;			// 삽입했으니 반복문을 나가서 다음 넣을수 있는 자리를 찾는다.
				}
			}
		}
		used = size;	// 사용된 갯수에 해시테이블의 데이터 갯수를 넣는다.
	}
}
