import java.util.Scanner;

public class TestLinkedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();	
	}
	
	// 큐의 데이터 출력
	public static void print(Node head)
	{
		// head 노드는 비어있으니 head의 다음 노드 부터 데이터를 출력한다.
		// 데이터를 출력하다가 p가 다시 헤드가 된다면 반복문을 탈출한다.
		for(Node p = head.getNext(); p!=head ; p = p.getNext())
		{
			System.out.print(p.getobject() + " ");
		}
		System.out.println();
	}
	
	// 큐 옵션 실행
	public static void run()
	{
		LinkedQueue queue = new LinkedQueue();	// 양방향 연결리스트 큐 객체 생성
		Scanner sc = new Scanner(System.in);
		Object item;							// 데이터 변수
		int number;								// 옵션 선택 값 변수
		
		while(true)
		{
			System.out.println("1.[Queue] 내용추가");
			System.out.println("2.[Queue] 내용 N개 삭제");
			System.out.println("3.[Queue] 내용 하나 삭제");
			System.out.println("4.[Queue] 사이즈 출력");
			System.out.println("5.[Queue] 내용 출력");
			System.out.println("6.[Queue] 첫번째 값 출력");
			System.out.println("7.[Queue] 종료");
			number = sc.nextInt();
			sc.nextLine();
			
			if(number==1)	// 큐에 데이터 추가
			{
				System.out.println("추가하고 싶은 내용 : ");
				item = sc.next();
				queue.add(item);
				System.out.println("["+item+"]가 추가되었습니다.");
			}else if(number==2)	// 큐에 데이터 N개 삭제
			{
				System.out.println("삭제하고 싶은 갯수 : ");
				number = sc.nextInt();	// 삭제 하고 싶은 갯수 입력
				sc.nextLine();
				
				// N번 반복하여 큐에서 데이터를 제거한다.
				for(int i=0;i<number;i++)
				{
					item = queue.remove();	// 큐에서 제거된 값을 변수에 넣어 출력한다.
					System.out.println("["+item+"]가 삭제 되었습니다.");
				}
			}else if(number==3)	// 큐에서 데이터 1개 삭제
			{
				item = queue.remove();	// 데이터를 변수에 넣고 큐에서 제거한다.
				System.out.println("["+item+"]가 삭제 되었습니다.");
			}else if(number==4)	// 사이즈 반환
			{
				System.out.println(queue.size());
			}else if(number==5)	// 큐의 데이터 순차 출력 (front->rear)
			{
				print(queue.getHead());
			}else if(number==6)	// 큐의 제일 첫번째 데이터 출력
			{
				System.out.println(queue.peek());
			}else if(number==7)	// 종료
			{
				System.exit(0);
			}
			else {				// 1~7이외의 숫자를 입력받을때.
				System.out.println("1~7의 숫자를 입력해주세요");
				continue;
			}
		}
	}
}
