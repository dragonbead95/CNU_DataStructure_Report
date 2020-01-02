import java.util.Scanner;

public class TestRecursion {
	Scanner sc = new Scanner(System.in);
	Quicksort quick = new Quicksort(10);	// Quicksort Ŭ���� ũ�� 10���� ����
	int number;		// �ɼ� ���� ��� �Էº���
	int data;	// add ��� �Էº���
	
	public void run()
	{
		while(true)
		{
			System.out.println("1. [Recursive] add");
			System.out.println("2. [Recursive] sort");
			System.out.println("3. [Recursive] print");
			System.out.println("4. ����");
			number = sc.nextInt();
			sc.nextLine();
			
			if(number==1)	// add ���
			{
				System.out.println("�߰� �ϰ� ���� ������ �Է��ϼ��� : ");
				data = sc.nextInt();
				sc.nextLine();
				quick.add(data);	// �迭�� ���� �߰�
			}else if(number==2)	// sort ���
			{
				quick.sorting();	// �迭�� �����ķ� ������������ ���
				System.out.println("���� �������� ���� �Ǿ����ϴ�.");
			}else if(number==3)	// print ���
			{
				quick.getFirst();	// �迭�� ù��° ���� ���
				quick.getNext();	// �迭�� �ι�° ���� ���
			}else if(number==4) // ���� ���
			{
				System.exit(1);
			}
		}
	}
}
