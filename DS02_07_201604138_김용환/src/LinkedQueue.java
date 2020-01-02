public class LinkedQueue {
	private Node head = new Node();	// �� �������� �����Ѵ�.
	private int size;				// ť�� ������ ���� ����
	
	// ť�� �����͸� �߰��ϴ� �޼ҵ�
	public void add(Object item)
	{
		if(size==0)	// ť�� �����Ͱ� ������
		{
			head.setNext(new Node(item,head,head));	// ���ο� ��带 �����ϰ� ����� prev�� next�� ��带 ����Ų��.
													// head�� next�� ���ο� ��带 ����Ų��.
			
			head.setPrev(head.getNext());			// head�� prev�� ���ο� ��带 ����Ų��.
		}else {	// ť�� �����Ͱ� ������
			Node node = new Node(item,head.getPrev(),head); // ���ο� ����� prev�� ���� ������ ��带 ����Ų��.
															// ���ο� ���� ������ ��尡 �����Ƿ� head�� ����Ų��.
			head.getPrev().setNext(node);	// ������ �ִ� ���� ������ ���� ���ο� ��带 ����Ų��.
			head.setPrev(node);				// head�� prev�� ���ο� ��带 ����Ų��.
		}
		size++;	// ������ ���� �߰�
	}
	
	public Object peek()	// �� �տ� �ִ� ��带 �����ִ� �۾�
	{
		// ť�� �����Ͱ� ������ ����ִٴ� �޽�����,
		// ť�� �����Ͱ� ������ head�� next�� ����Ű�� ����� �����͸� ��ȯ�Ѵ�.
		if(size==0) throw new IllegalArgumentException("the queue is empty");
		else return head.getNext().getobject();
	}
	
	// front�� ť���� ����
	public Object remove()
	{
		Object item = peek();	// ������ ����� ������ ���� �����Ѵ�.
		head.setNext(head.getNext().getNext());	//head�� next�� ������ ����� ���� ��带 ����Ų��.
		head.getNext().setPrev(head);	// head�� next�� ����Ű�� ���� prev�� head�� ����Ų��.
		size--;							// ������ ���� ����.
		return item;					// ������ ����� ������ �� ��ȯ
	}
	
	// ť�� ������ ���� ��ȯ
	public int size()
	{
		return size;
	}
	
	// ��� ��� ��ȯ
	public Node getHead()
	{
		return this.head;
	}
}
