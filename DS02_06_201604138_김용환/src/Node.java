
public class Node {
	private int data;	// 데이터
	private Node next;		// 다음 노드
	
	// 노드 생성시 데이터 삽입
	public Node(int data)
	{
		this.data = data;
	}
	
	// 해당 노드의 데이터 반환
	public int getData()
	{
		return data;
	}
	
	// 해당 노드의 다음 노드를 반환
	public Node getNext()
	{
		return next;
	}
	
	// 해당 노드의 데이터 삽입
	public void setData(int data)
	{
		this.data = data;
	}
	
	// 해당 노드의 다음 노드를 지정
	public void setNext(Node next)
	{
		this.next = next;
	}
}
