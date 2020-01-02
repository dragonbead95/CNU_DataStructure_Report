import java.util.*;
public class HashTable {
	private Entry[] entries;						// �ؽ� ���̺� �迭 ����
	private int size, used, collisionCount;			// �ؽ����̺��� ����, ��� ����, �浹 Ƚ�� ����
	private float loadFactor;						// ������ ����
	private final Entry NIL = new Entry(null,null);	// ���� ����
	
	public HashTable(int capacity, float loadFactor)
	{
		entries = new Entry[capacity];	// �ؽ� ���̺��� ũ��
		this.loadFactor = loadFactor; 	// �ؽ� ���̺��� ������(0.75F)
	}
		
	// ���� Ŭ����
	private class Entry{
		Object key, value;	// Ű��, Country ��ü ��
		
		Entry(Object k,Object v)
		{
			key = k;
			value = v;
		}
	}
	
	public Object get(Object key)
	{
		int h = hash(key);		// key���� ���� hash ���� ã�´�.
		
		if(h == -1)				// �ؽ����� -1�̸� null ��ȯ
			return null;
		
		// entries �ؽ� ���̺��� �ؽ� ������ Ž���Ѵ�.
		for(int i=0;i<entries.length;i++)
		{
			int j = nextProbe(h,i);		// ���� ��ġ ���� ã�´�.
			Entry entry = entries[j];	// �ӽ� ������ �ؽ� ���̺� ���� �ִ´�.
			
			if(entry==null) 
				break;
			
			if(entry.key.equals(key)) // ã���� �ϴ� key���� �����ϸ� entry�� ��ü���� ��ȯ�Ѵ�.
			{
				System.out.println("[DEBUG] get, " + j);	// �ؽ� ���̺����� ã�� ��ġ
				return entry.value;
			}
			System.out.println("[DEBUG] Hash Collision, get " + j);	// �ؽ� ���̺��� �浹�� ��ġ
		}
		return null;	// Ž�� ����
	}
	
	public Object put(Object key, Object value)
	{
		if(used>loadFactor*entries.length) {	// ���� ������ ���������� ũ�� rehash()�� �Ѵ�.
			rehash();
		}
		int h = hash(key);	// �ؽ� ���� �����Ѵ�.
		
		if(h == -1)			
			return null;
		
		// �ؽ� ���̺��� �ؽ� ������ Ž���Ѵ�.
		for(int i=0;i<entries.length;i++)
		{
			int j = nextProbe(h,i);		// �浹�� �Ͼ�� ���� �ؽ����� ã�´�.
			Entry entry = entries[j];	// �ӽú����� �ؽ� ���� �����Ѵ�.
			
			if(entry==null)	// �ؽ� ���̺� ������ ������ ����
			{
				System.out.println("[DEBUG] put, " + j);	// �ؽ� ���̺� ���� ��ġ��
				entries[j] = new Entry(key,value);			// Ű���� ������ ����
				++size;
				++used;
				return null;
			}
			
			if(entry.key.equals(key)) {		// key���� ���Ͽ� ������ Ű���� �����Ѵٸ� ��ü�Ѵ�.
				Object oldvalue = entry.value;
				entries[j].value = value;	// ���ο� ������ ������ ��ü�Ѵ�.
				return oldvalue;
			}
			System.out.println("[DEBUG] Hash Collision, put, " + j);	// �浹�� ��ġ			
		}
		return null;	// ���� ����
	}
	
	// Key ���� �Ű������� �Է¹޾� hash ���� ã�� �޼ҵ�
	private int hash(Object key)
	{
		if(key==null) throw new IllegalArgumentException();
		
		// key���� ������ ���� ã�� �ؽ����� ��ȯ�Ѵ�.
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
	
	// �ؽ� ���� �浹���� ��� ���� ������� ã�� ���� �޼ҵ�
	private int nextProbe(int h, int i)
	{
		return (h+i)%entries.length;	// h+i�� ���� �ؽ� ���̺��� ũ��� �����ϸ� 0�� ��ȯ�Ѵ�.
	}
	
	private void rehash()
	{
		Entry[] oldEntries = entries;	// �ӽ� �迭�� �ؽ� ���̺� ����
		entries = new Entry[2*oldEntries.length+1];	// �ؽ� ���̺��� 2��+1�� �ø���.
													// +1�� �ϴ� ������ Ȧ���� ����� ���ؼ��̴�.
		
		// ���� �ؽ����̺��� Ž���ϸ� ������Ų �ؽ����̺��� �ڸ��� entry�� �ִ´�.
		for(int k=0;k<oldEntries.length;k++)
		{
			Entry entry = oldEntries[k];	// �ӽ� entry�� �ؽ����̺� ���� �ִ´�.
			
			if(entry==null) continue;		// oldEntries[k]�� ������� ���� �ڸ��� Ž���Ѵ�.
			
			int h = hash(entry.key);		// entry�� key ���� �ؽð��� ã�´�.
			
			// ������Ų �ؽ����̺� �ڸ��� ���� �ڸ��� ã�´�.
			for(int i=0;i<entries.length;i++)
			{
				int j = nextProbe(h,i);	// ���� �ڸ��� ã�� �Լ�
				if(entries[j]==null) // �ؽ����̺� �ڸ��� ������� �ش� �ڸ��� entry�� �����Ѵ�.
				{
					entries[j] = entry;
					break;			// ���������� �ݺ����� ������ ���� ������ �ִ� �ڸ��� ã�´�.
				}
			}
		}
		used = size;	// ���� ������ �ؽ����̺��� ������ ������ �ִ´�.
	}
}
