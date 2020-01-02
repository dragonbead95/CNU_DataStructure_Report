
public class Node {
	private Object object;	// ����� ������
	private Node prev;		// ���� ���
	private Node next;		// ���� ���
	
	// head�� ������ �� �� ��带 �����.
	public Node()
	{
		this.object = null;
	}
	
	// ���ο� ��� ������ object ������ �Ű����� ���� �Է¹޴´�.
	public Node(Object object)
	{
		this.object = object;
		this.prev = this;
		this.next = this;
	}
	
	// ù ��� ������ ������,�������,���� ��� ����
	public Node(Object object, Node prev, Node next)
	{
		this.object = object;
		this.prev = prev;
		this.next = next;
	}
	
	// �ش� ����� ������ ��ȯ
	public Object getobject()
	{
		return object;
	}
	
	// �ش� ����� ���� ��带 ��ȯ
	public Node getPrev()
	{
			return prev;
	}
	
	// �ش� ����� ���� ��带 ��ȯ
	public Node getNext()
	{
		return next;
	}
	
	// �ش� ����� ������ ����
	public void setobject(Object object)
	{
		this.object = object;
	}

	// �ش� ����� ���� ��带 ����
	public void setPrev(Node prev)
	{
		this.prev = prev;
	}
	
	// �ش� ����� ���� ��带 ����
	public void setNext(Node next)
	{
		this.next = next;
	}
}
