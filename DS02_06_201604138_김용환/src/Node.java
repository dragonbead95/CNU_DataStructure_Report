
public class Node {
	private int data;	// ������
	private Node next;		// ���� ���
	
	// ��� ������ ������ ����
	public Node(int data)
	{
		this.data = data;
	}
	
	// �ش� ����� ������ ��ȯ
	public int getData()
	{
		return data;
	}
	
	// �ش� ����� ���� ��带 ��ȯ
	public Node getNext()
	{
		return next;
	}
	
	// �ش� ����� ������ ����
	public void setData(int data)
	{
		this.data = data;
	}
	
	// �ش� ����� ���� ��带 ����
	public void setNext(Node next)
	{
		this.next = next;
	}
}
