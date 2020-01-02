import java.util.Scanner;

public class TestNodeSet {
	Set set = new NodeSet();				// NodeSet 클래스의 객체
	Scanner scan = new Scanner(System.in);	// 숫자,문자를 입력받을 Scanner 객체
	int number;								// 숫자를 입력받을 변수
	int i,j;								// swap 메서드를 위한 숫자를 입력받을 변수
	String content;							// 연결리스트 노드의 데이터를 출력할 변수
	
	public void run()
	{
		while(true)	// 선택 옵션 무한 반복
		{
			System.out.println("1. 추가 \n"
					+ "2. 삭제 \n"
					+ "3. 확인 \n"
					+ "4. 내용이 있는지 확인 \n"
					+ "5. 스왑 \n"
					+ "6. 종료");
			
			number = scan.nextInt();	// 숫자 입력
			scan.nextLine();			// 문자 입력
			
			if(number==1)
			{
				System.out.println("추가할 데이터");
				content = scan.next();
				if(set.add(content)==true)	// 추가 성공
				{
					System.out.print("정상적으로 추가 되었습니다.");
				}else{						// 데이터 중복
					System.out.print("내용이 중복되었습니다.");
				};
			}
			else if(number==2)
			{
				System.out.print("삭제할 데이터:");
				content = scan.next();
				if(set.remove(content)==true)	// 삭제 성공
				{
					System.out.println(content + "가 삭제되었습니다.");
				}
				else							// 삭제 실패
				{
					System.out.println(content + "데이터가 없습니다.");
				};
			}
			else if(number==3)	// 현재 노드들 데이터 확인
			{
				System.out.println("현재 노드의 데이터는 " + set.checkNode());
				System.out.println("총 "+set.size() + "개의 노드가 존재합니다.");
			}
			else if(number==4)	// 데이터가 포함되어 있는지 확인
			{
				System.out.println("확인하고 싶은 내용 : ");
				content = scan.next();
				if(set.contains(content)==true)
				{
					System.out.print("해당 내용이 존재합니다.");
				}else {
					System.out.print("해당 내용이 존재하지 않습니다.");
				}
			}
			else if(number==5)	// i번째 j번째의 노드를 교환
			{
				System.out.println("스왑함수입니다.");
				System.out.println("바꿀노드 i를 입력해주세요");
				i = scan.nextInt();
				System.out.println("바꿀노드 j를 입력해주세요");
				j = scan.nextInt();
				if(set.swap(i, j)==true)	// 교환 성공
				{
					System.out.println("스왑되었습니다.");
				}else {						// 교환 실패
					System.out.println("동일한 숫자입니다.");
				}
			}else if(number==6){			// 종료
				System.exit(0);
			}else {							// 1~6이외의 숫자 입력시 종료
				break;
			}
			System.out.println();
		}
	}
}
