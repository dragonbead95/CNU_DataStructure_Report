import java.util.Scanner;

public class TestRecursion {
	Scanner sc = new Scanner(System.in);
	Quicksort quick = new Quicksort(10);	// Quicksort 클래스 크기 10으로 생성
	int number;		// 옵션 선택 기능 입력변수
	int data;	// add 기능 입력변수
	
	public void run()
	{
		while(true)
		{
			System.out.println("1. [Recursive] add");
			System.out.println("2. [Recursive] sort");
			System.out.println("3. [Recursive] print");
			System.out.println("4. 종료");
			number = sc.nextInt();
			sc.nextLine();
			
			if(number==1)	// add 기능
			{
				System.out.println("추가 하고 싶은 내용을 입력하세요 : ");
				data = sc.nextInt();
				sc.nextLine();
				quick.add(data);	// 배열에 원소 추가
			}else if(number==2)	// sort 기능
			{
				quick.sorting();	// 배열을 퀵정렬로 오름차순으로 출력
				System.out.println("오름 차순으로 정렬 되었습니다.");
			}else if(number==3)	// print 기능
			{
				quick.getFirst();	// 배열의 첫번째 원소 출력
				quick.getNext();	// 배열의 두번째 원소 출력
			}else if(number==4) // 종료 기능
			{
				System.exit(1);
			}
		}
	}
}
