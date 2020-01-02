public class LinkedQueue {
	private Node head = new Node();	// 빈 헤드공간을 생성한다.
	private int size;				// 큐의 데이터 갯수 변수
	
	// 큐에 데이터를 추가하는 메소드
	public void add(Object item)
	{
		if(size==0)	// 큐에 데이터가 없을때
		{
			head.setNext(new Node(item,head,head));	// 새로운 노드를 생성하고 노드의 prev와 next는 헤드를 가리킨다.
													// head의 next는 새로운 노드를 가리킨다.
			
			head.setPrev(head.getNext());			// head의 prev는 새로운 노드를 가리킨다.
		}else {	// 큐에 데이터가 있을때
			Node node = new Node(item,head.getPrev(),head); // 새로운 노드의 prev는 제일 마지막 노드를 가리킨다.
															// 새로운 노드는 마지막 노드가 됬으므로 head를 가리킨다.
			head.getPrev().setNext(node);	// 기존에 있던 제일 마지막 노드는 새로운 노드를 가리킨다.
			head.setPrev(node);				// head의 prev는 새로운 노드를 가리킨다.
		}
		size++;	// 데이터 갯수 추가
	}
	
	public Object peek()	// 맨 앞에 있는 노드를 꺼내주는 작업
	{
		// 큐에 데이터가 없으면 비어있다는 메시지를,
		// 큐에 데이터가 있으면 head의 next가 가리키는 노드의 데이터를 반환한다.
		if(size==0) throw new IllegalArgumentException("the queue is empty");
		else return head.getNext().getobject();
	}
	
	// front를 큐에서 제거
	public Object remove()
	{
		Object item = peek();	// 삭제할 노드의 데이터 값을 저장한다.
		head.setNext(head.getNext().getNext());	//head의 next는 삭제할 노드의 다음 노드를 가리킨다.
		head.getNext().setPrev(head);	// head의 next가 가리키는 노드는 prev를 head를 가리킨다.
		size--;							// 데이터 갯수 감소.
		return item;					// 삭제한 노드의 데이터 값 반환
	}
	
	// 큐의 데이터 갯수 반환
	public int size()
	{
		return size;
	}
	
	// 헤드 노드 반환
	public Node getHead()
	{
		return this.head;
	}
}
