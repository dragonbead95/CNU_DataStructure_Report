import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStack stack = new IntNodeStack();
		Scanner sc = new Scanner(System.in);
		int number;		// ����� �����ϴ� ����
		int n;			// ������ ������ ����
		
		while(true)
		{
			System.out.println("1. ���ÿ� �����߰�");
			System.out.println("2. ���ÿ� ���������� ���� ���� ����");
			System.out.println("3. ���ÿ� ó�� ���� ���� ����");
			System.out.println("4. ���ÿ� ������ ���");
			System.out.println("5. ���� ���");
			System.out.println("6. ����");
			number = sc.nextInt();
			sc.nextLine();
			
			if(number==1)	// ���� ������ �߰�
			{
				System.out.println("�߰��ϰ� ���� ���� �Է� : ");
				n = sc.nextInt();
				stack.push(n);
			}else if(number==2)	// ���ÿ� ������ ����
			{
				n = stack.pop();
				System.out.println("["+n+"] ������ �Ǿ����ϴ�.");
			}else if(number==3)	// ���ÿ� �ٴ��� ������ ����
			{
				n = stack.popBottom();
				System.out.println("["+n+"] ������ �Ǿ����ϴ�.");
			}else if(number==4)	// ������ ������ ����
			{
				System.out.println(stack.size());
			}else if(number==5)	// ������ ������ ���
			{
				System.out.println("���� ����� �����ʹ� " + ((IntNodeStack) stack).checkNode());
				System.out.println(" �� " + stack.size() + "���� ��尡 �����մϴ�.");
				System.out.println();
			}else if(number==6)	// ����
			{
				System.exit(0);
			}else {
				System.out.println("1~6�� ���ڸ� �Է����ּ���");
				continue;
			}
		}
	}
}
