import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStack stack = new IntNodeStack();
		Scanner sc = new Scanner(System.in);
		int number;		// 기능을 선택하는 변수
		int n;			// 스택의 데이터 변수
		
		while(true)
		{
			System.out.println("1. 스택에 내용추가");
			System.out.println("2. 스택에 마지막으로 들어온 내용 삭제");
			System.out.println("3. 스택에 처음 들어온 내용 삭제");
			System.out.println("4. 스택에 사이즈 출력");
			System.out.println("5. 내용 출력");
			System.out.println("6. 종료");
			number = sc.nextInt();
			sc.nextLine();
			
			if(number==1)	// 스택 데이터 추가
			{
				System.out.println("추가하고 싶은 숫자 입력 : ");
				n = sc.nextInt();
				stack.push(n);
			}else if(number==2)	// 스택에 데이터 삭제
			{
				n = stack.pop();
				System.out.println("["+n+"] 삭제가 되었습니다.");
			}else if(number==3)	// 스택에 바닥의 데이터 삭제
			{
				n = stack.popBottom();
				System.out.println("["+n+"] 삭제가 되었습니다.");
			}else if(number==4)	// 스택의 사이즈 삭제
			{
				System.out.println(stack.size());
			}else if(number==5)	// 스택의 데이터 출력
			{
				System.out.println("현재 노드의 데이터는 " + ((IntNodeStack) stack).checkNode());
				System.out.println(" 총 " + stack.size() + "개의 노드가 존재합니다.");
				System.out.println();
			}else if(number==6)	// 종료
			{
				System.exit(0);
			}else {
				System.out.println("1~6의 숫자를 입력해주세요");
				continue;
			}
		}
	}
}
