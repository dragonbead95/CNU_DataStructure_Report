import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new ArraySet();
		Scanner scan = new Scanner(System.in);
		int number;
		String content;
		
		while(true)
		{
			System.out.println("1. 추가 \n"
					+ "2. 삭제 \n"
					+ "3. 내용출력 \n"
					+ "4. 사이즈출력 \n"
					+ "5. 해당 내용이 있는지 확인 \n"
					+ "6. 종료");
			
			number = scan.nextInt();
			scan.nextLine();
			
			if(number==1)
			{
				System.out.println("추가하고 싶은 내용 : ");
				content = scan.next();
				if(set.add(content)==true)
				{
					System.out.print("정상적으로 추가 되었습니다.");
				}else{
					System.out.print("내용이 중복되었습니다.");
				};
			}
			else if(number==2)
			{
				System.out.print("삭제하고 싶은 내용을 입력하세요 : ");
				content = scan.next();
				if(set.remove(content)==true)
				{
					System.out.println(content + "가 삭제되었습니다.");
				}
				else
				{
					System.out.println(content + "데이터가 없습니다.");
				};
			}
			else if(number==3)
			{
				System.out.print(set.getFirst());
				for(int i=1;i<set.size();i++)
				{
					System.out.print(", " + set.getNext());
				}
			}
			else if(number==4)
			{
				System.out.print(set.size());
			}
			else if(number==5)
			{
				System.out.println("확인하고 싶은 내용 : ");
				content = scan.next();
				if(set.contains(content)==true)
				{
					System.out.print("해당 내용이 존재합니다.");
				}else {
					System.out.print("해당 내용이 존재하지 않습니다.");
				}
			}else {
				break;
			}
			System.out.println();
		}
	}
}
