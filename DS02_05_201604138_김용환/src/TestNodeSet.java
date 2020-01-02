import java.util.Scanner;

public class TestNodeSet {
	Set set = new NodeSet();				// NodeSet Ŭ������ ��ü
	Scanner scan = new Scanner(System.in);	// ����,���ڸ� �Է¹��� Scanner ��ü
	int number;								// ���ڸ� �Է¹��� ����
	int i,j;								// swap �޼��带 ���� ���ڸ� �Է¹��� ����
	String content;							// ���Ḯ��Ʈ ����� �����͸� ����� ����
	
	public void run()
	{
		while(true)	// ���� �ɼ� ���� �ݺ�
		{
			System.out.println("1. �߰� \n"
					+ "2. ���� \n"
					+ "3. Ȯ�� \n"
					+ "4. ������ �ִ��� Ȯ�� \n"
					+ "5. ���� \n"
					+ "6. ����");
			
			number = scan.nextInt();	// ���� �Է�
			scan.nextLine();			// ���� �Է�
			
			if(number==1)
			{
				System.out.println("�߰��� ������");
				content = scan.next();
				if(set.add(content)==true)	// �߰� ����
				{
					System.out.print("���������� �߰� �Ǿ����ϴ�.");
				}else{						// ������ �ߺ�
					System.out.print("������ �ߺ��Ǿ����ϴ�.");
				};
			}
			else if(number==2)
			{
				System.out.print("������ ������:");
				content = scan.next();
				if(set.remove(content)==true)	// ���� ����
				{
					System.out.println(content + "�� �����Ǿ����ϴ�.");
				}
				else							// ���� ����
				{
					System.out.println(content + "�����Ͱ� �����ϴ�.");
				};
			}
			else if(number==3)	// ���� ���� ������ Ȯ��
			{
				System.out.println("���� ����� �����ʹ� " + set.checkNode());
				System.out.println("�� "+set.size() + "���� ��尡 �����մϴ�.");
			}
			else if(number==4)	// �����Ͱ� ���ԵǾ� �ִ��� Ȯ��
			{
				System.out.println("Ȯ���ϰ� ���� ���� : ");
				content = scan.next();
				if(set.contains(content)==true)
				{
					System.out.print("�ش� ������ �����մϴ�.");
				}else {
					System.out.print("�ش� ������ �������� �ʽ��ϴ�.");
				}
			}
			else if(number==5)	// i��° j��°�� ��带 ��ȯ
			{
				System.out.println("�����Լ��Դϴ�.");
				System.out.println("�ٲܳ�� i�� �Է����ּ���");
				i = scan.nextInt();
				System.out.println("�ٲܳ�� j�� �Է����ּ���");
				j = scan.nextInt();
				if(set.swap(i, j)==true)	// ��ȯ ����
				{
					System.out.println("���ҵǾ����ϴ�.");
				}else {						// ��ȯ ����
					System.out.println("������ �����Դϴ�.");
				}
			}else if(number==6){			// ����
				System.exit(0);
			}else {							// 1~6�̿��� ���� �Է½� ����
				break;
			}
			System.out.println();
		}
	}
}
