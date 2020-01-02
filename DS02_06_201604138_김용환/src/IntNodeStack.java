public class IntNodeStack implements IntStack{
	private Node head;	// ������ top
	private int size;	// ������ ������
	
	public IntNodeStack()
	{
		head = null;	// ��带 null�� �ʱ�ȭ
		size = 0;		// ����� 0���� �ʱ�ȭ
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (head==null);	// ��尡 ����Ű�°��� null�̸� ����ִ� ����
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(head==null)
			return -1;
		int temp = this.head.getData();	// ���� ��ũ����Ʈ���� top�̹Ƿ� ��尡 ����Ű�� �����͸� ������ �ִ´�.
		this.head = this.head.getNext();// ��尡 ������ ��尡 ����Ű�� ����� ���� ��带 ����Ų��.
		size--;							// �������� ���� ����
		
		return temp;					// ������ ������ ��ȯ
	}

	@Override
	public int popBottom() {
		// TODO Auto-generated method stub
		if(head==null)					// ���ÿ� �����Ͱ� ������ -1 ��ȯ
				return -1;
		
		int temp;						// popBottom �޼��忡�� ��ȯ���� ����
		Node p = this.head;				// �ӽ� ��� p�� ��带 ����Ű�� �Ѵ�.
		Node before = this.head;		// �ӽ� ��� before�� ��带 ����Ű�� �Ѵ�.
		
		while(p!=null)					// p�� null�� �ƴҵ��� �ݺ��ؼ� ������ ��带 ã�´�.
		{
			if(p.getNext()==null)		// p�� ���� ��尡 null�̸� ������ ����̹Ƿ� �ݺ����� Ż���Ѵ�.
			{
				break;
			}
			before = p;					// p�� �����Ѽ� ���� p�� ������带 ����Ű�� �����.
			p = p.getNext();			// p�� ������带 ����Ų��.
		}
		before.setNext(null);			// p ���� ����ǹǷ� p�� ������尡 null�� ������ ������ ���´�.
		temp = p.getData();				// p�� �����͸� �����Ѵ�.
		size--;							// ������ ����
		
		return temp;
	}

	@Override
	public void push(int n) {
		// TODO Auto-generated method stub
		Node new_Node = new Node(n);	// ���ο� ��� ����
		new_Node.setNext(this.head);	// ���ο� ����� next�� ��尡 ����Ű���� ����Ų��.
		this.head = new_Node;			// ���(top)�� ���ο� ��带 ����Ų��.		
		size++;							// ������ ����
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;					// ������ ������ ���� ��ȯ
	}
	
	public String checkNode()
	{
		String str = "";
		// ��ũ����Ʈ�� ��带 Ȯ���ϸ� String ���ڿ��� �����Ѵ�.
		for(Node p=this.head; p!=null; p=p.getNext())
		{
			str = str + p.getData() + " ";
		}
		return str;
	}
}
