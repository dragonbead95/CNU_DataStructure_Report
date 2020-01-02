public class IntNodeStack implements IntStack{
	private Node head;	// 스택의 top
	private int size;	// 스택의 사이즈
	
	public IntNodeStack()
	{
		head = null;	// 헤드를 null로 초기화
		size = 0;		// 사이즈를 0으로 초기화
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (head==null);	// 헤드가 가리키는것이 null이면 비어있는 상태
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(head==null)
			return -1;
		int temp = this.head.getData();	// 헤드는 링크리스트에서 top이므로 헤드가 가리키는 데이터를 변수에 넣는다.
		this.head = this.head.getNext();// 헤드가 기존에 헤드가 가리키던 노드의 다음 노드를 가리킨다.
		size--;							// 사이즈의 갯수 감소
		
		return temp;					// 추출한 데이터 반환
	}

	@Override
	public int popBottom() {
		// TODO Auto-generated method stub
		if(head==null)					// 스택에 데이터가 없으면 -1 반환
				return -1;
		
		int temp;						// popBottom 메서드에서 반환받을 변수
		Node p = this.head;				// 임시 노드 p를 헤드를 가리키게 한다.
		Node before = this.head;		// 임시 노드 before도 헤드를 가리키게 한다.
		
		while(p!=null)					// p가 null이 아닐동안 반복해서 마지막 노드를 찾는다.
		{
			if(p.getNext()==null)		// p의 다음 노드가 null이면 마지막 노드이므로 반복문을 탈출한다.
			{
				break;
			}
			before = p;					// p를 가리켜서 현재 p의 이전노드를 가리키게 만든다.
			p = p.getNext();			// p는 다음노드를 가리킨다.
		}
		before.setNext(null);			// p 노드는 추출되므로 p의 이전노드가 null을 가리켜 연결을 끊는다.
		temp = p.getData();				// p의 데이터를 추출한다.
		size--;							// 사이즈 감소
		
		return temp;
	}

	@Override
	public void push(int n) {
		// TODO Auto-generated method stub
		Node new_Node = new Node(n);	// 새로운 노드 생성
		new_Node.setNext(this.head);	// 새로운 노드의 next는 헤드가 가리키던걸 가르킨다.
		this.head = new_Node;			// 헤드(top)은 새로운 노드를 가리킨다.		
		size++;							// 사이즈 증가
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;					// 스택의 데이터 갯수 반환
	}
	
	public String checkNode()
	{
		String str = "";
		// 링크리스트의 노드를 확인하며 String 문자열에 저장한다.
		for(Node p=this.head; p!=null; p=p.getNext())
		{
			str = str + p.getData() + " ";
		}
		return str;
	}
}
