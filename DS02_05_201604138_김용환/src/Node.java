
public class Node {
	private String data;	// ������
	private Node next;		// ���� ���
	
	// ��� ������ ������ ����
	public Node(String data)
	{
		this.data = data;
	}
	
	// ��� ������ �����Ϳ� ���� ��� ����
	public Node(String data, Node next)
	{
		this.data = data;
		this.next = next;
	}
	
	// �ش� ����� ������ ��ȯ
	public String getData()
	{
		return data;
	}
	
	// �ش� ����� ���� ��带 ��ȯ
	public Node getNext()
	{
		return next;
	}
	
	// �ش� ����� ������ ����
	public void setData(String data)
	{
		this.data = data;
	}
	
	// �ش� ����� ���� ��带 ����
	public void setNext(Node next)
	{
		this.next = next;
	}
}
