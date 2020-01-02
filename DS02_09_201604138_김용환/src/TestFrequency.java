import java.util.*;

public class TestFrequency {
	String[] countries = {"KO","DE","ES","FR","DE","ES","DE"};	//문자열 배열 초기화
	List list = Arrays.asList(countries);	//countries 배열을 리스트 형태로 저장
	
	public void run()
	{
		// 리스트에 해당하는 나라이름이 몇개 포함되어 있는지 출력한다.
		System.out.println("frequency(list,\"DE\"): " + frequency(list, "DE"));
		System.out.println("frequency(list,\"KO\"): " + frequency(list, "KO"));
		System.out.println("frequency(list,\"ES\"): " + frequency(list, "ES"));
		System.out.println("frequency(list,\"FR\"): " + frequency(list, "FR"));
	}
	
	// 리스트안에 해당object의 갯수를 반환한다.
	public int frequency(List list,Object object)
	{
		Iterator itr = list.iterator();	// Iterator 생성자 설정
		int count=0;					// 해당 나라 갯수
		
		// list를 Iterator로 순회하며 데이터를 비교한다.
		while(itr.hasNext())
		{
			if(itr.next().equals(object))	// next() 메소드로 반환된 나라와 object와 비교한다.
				count++;					// 일치하면 count 값을 증가시킨다.
		}
		return count;					// 카운트 값 반환
	}
}
