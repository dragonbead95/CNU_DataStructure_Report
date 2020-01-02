import java.util.Scanner;

public class TestLinkedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();	
	}
	
	// ť�� ������ ���
	public static void print(Node head)
	{
		// head ���� ��������� head�� ���� ��� ���� �����͸� ����Ѵ�.
		// �����͸� ����ϴٰ� p�� �ٽ� ��尡 �ȴٸ� �ݺ����� Ż���Ѵ�.
		for(Node p = head.getNext(); p!=head ; p = p.getNext())
		{
			System.out.print(p.getobject() + " ");
		}
		System.out.println();
	}
	
	// ť �ɼ� ����
	public static void run()
	{
		LinkedQueue queue = new LinkedQueue();	// ����� ���Ḯ��Ʈ ť ��ü ����
		Scanner sc = new Scanner(System.in);
		Object item;							// ������ ����
		int number;								// �ɼ� ���� �� ����
		
		while(true)
		{
			System.out.println("1.[Queue] �����߰�");
			System.out.println("2.[Queue] ���� N�� ����");
			System.out.println("3.[Queue] ���� �ϳ� ����");
			System.out.println("4.[Queue] ������ ���");
			System.out.println("5.[Queue] ���� ���");
			System.out.println("6.[Queue] ù��° �� ���");
			System.out.println("7.[Queue] ����");
			number = sc.nextInt();
			sc.nextLine();
			
			if(number==1)	// ť�� ������ �߰�
			{
				System.out.println("�߰��ϰ� ���� ���� : ");
				item = sc.next();
				queue.add(item);
				System.out.println("["+item+"]�� �߰��Ǿ����ϴ�.");
			}else if(number==2)	// ť�� ������ N�� ����
			{
				System.out.println("�����ϰ� ���� ���� : ");
				number = sc.nextInt();	// ���� �ϰ� ���� ���� �Է�
				sc.nextLine();
				
				// N�� �ݺ��Ͽ� ť���� �����͸� �����Ѵ�.
				for(int i=0;i<number;i++)
				{
					item = queue.remove();	// ť���� ���ŵ� ���� ������ �־� ����Ѵ�.
					System.out.println("["+item+"]�� ���� �Ǿ����ϴ�.");
				}
			}else if(number==3)	// ť���� ������ 1�� ����
			{
				item = queue.remove();	// �����͸� ������ �ְ� ť���� �����Ѵ�.
				System.out.println("["+item+"]�� ���� �Ǿ����ϴ�.");
			}else if(number==4)	// ������ ��ȯ
			{
				System.out.println(queue.size());
			}else if(number==5)	// ť�� ������ ���� ��� (front->rear)
			{
				print(queue.getHead());
			}else if(number==6)	// ť�� ���� ù��° ������ ���
			{
				System.out.println(queue.peek());
			}else if(number==7)	// ����
			{
				System.exit(0);
			}
			else {				// 1~7�̿��� ���ڸ� �Է¹�����.
				System.out.println("1~7�� ���ڸ� �Է����ּ���");
				continue;
			}
		}
	}
}
