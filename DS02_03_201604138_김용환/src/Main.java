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
			System.out.println("1. �߰� \n"
					+ "2. ���� \n"
					+ "3. ������� \n"
					+ "4. ��������� \n"
					+ "5. �ش� ������ �ִ��� Ȯ�� \n"
					+ "6. ����");
			
			number = scan.nextInt();
			scan.nextLine();
			
			if(number==1)
			{
				System.out.println("�߰��ϰ� ���� ���� : ");
				content = scan.next();
				if(set.add(content)==true)
				{
					System.out.print("���������� �߰� �Ǿ����ϴ�.");
				}else{
					System.out.print("������ �ߺ��Ǿ����ϴ�.");
				};
			}
			else if(number==2)
			{
				System.out.print("�����ϰ� ���� ������ �Է��ϼ��� : ");
				content = scan.next();
				if(set.remove(content)==true)
				{
					System.out.println(content + "�� �����Ǿ����ϴ�.");
				}
				else
				{
					System.out.println(content + "�����Ͱ� �����ϴ�.");
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
				System.out.println("Ȯ���ϰ� ���� ���� : ");
				content = scan.next();
				if(set.contains(content)==true)
				{
					System.out.print("�ش� ������ �����մϴ�.");
				}else {
					System.out.print("�ش� ������ �������� �ʽ��ϴ�.");
				}
			}else {
				break;
			}
			System.out.println();
		}
	}
}
