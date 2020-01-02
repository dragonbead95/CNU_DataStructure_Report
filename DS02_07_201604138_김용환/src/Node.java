
public class Node {
	private Object object;	// 노드의 데이터
	private Node prev;		// 이전 노드
	private Node next;		// 다음 노드
	
	// head를 생성할 때 빈 노드를 만든다.
	public Node()
	{
		this.object = null;
	}
	
	// 새로운 노드 생성시 object 변수에 매개변수 값을 입력받는다.
	public Node(Object object)
	{
		this.object = object;
		this.prev = this;
		this.next = this;
	}
	
	// 첫 노드 생성시 데이터,이전노드,다음 노드 삽입
	public Node(Object object, Node prev, Node next)
	{
		this.object = object;
		this.prev = prev;
		this.next = next;
	}
	
	// 해당 노드의 데이터 반환
	public Object getobject()
	{
		return object;
	}
	
	// 해당 노드의 이전 노드를 반환
	public Node getPrev()
	{
			return prev;
	}
	
	// 해당 노드의 다음 노드를 반환
	public Node getNext()
	{
		return next;
	}
	
	// 해당 노드의 데이터 삽입
	public void setobject(Object object)
	{
		this.object = object;
	}

	// 해당 노드의 이전 노드를 지정
	public void setPrev(Node prev)
	{
		this.prev = prev;
	}
	
	// 해당 노드의 다음 노드를 지정
	public void setNext(Node next)
	{
		this.next = next;
	}
}
