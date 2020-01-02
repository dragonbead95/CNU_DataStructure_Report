import java.util.*;
public class TestHashTable {
	Scanner sc = new Scanner(System.in);
	HashTable ht = new HashTable(10,0.75F);	// 해쉬 테이블 크기와 적재율 초기화
	Object key;	// 키값
	String n,l;	// country 객체의 name, language 입력변수
	int number;	// 숫자 입력 변수
	
	public void run()
	{
		while(true)
		{
			System.out.println("1. [Hash] put");
			System.out.println("2. [Hash] get");
			System.out.println("3. [Hash] 종료");
			number = sc.nextInt();
			sc.nextLine();
			
			if(number==1)	// put 기능
			{
				System.out.println("key를 입력하세요 : ");
				key = sc.next();
				
				System.out.println("국가를 입력하세요 : ");
				n = sc.next();
				
				System.out.println("언어를 입력하세요 : ");
				l = sc.next();				
				
				ht.put(key, new Country(n,l));
			}else if(number==2)	// get 기능
			{
				System.out.println("key를 입력하세요 : ");
				key = sc.next();
				System.out.println(ht.get(key));
			}else if(number==3)	// 종료 기능
			{
				System.exit(1);
			}else {				// 종료 기능
				System.exit(1);
			}
		}
	}
}
