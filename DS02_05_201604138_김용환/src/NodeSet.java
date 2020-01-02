
public class NodeSet implements Set{

	private Node head;	// 연결리스트의 시작을 나타내는 노드
	private int size;	// 연결리스트의 노드들의 갯수 변수
	
	@Override
	public boolean add(String data) {
		// TODO Auto-generated method stub
		if(!this.contains(data))	// 데이터의 중복 확인
		{
			Node newNode = new Node(data);	// 새 노드 생성
			newNode.setNext(this.head);		// 헤드가 가리키는 노드를 가리킴
			this.head = newNode;			// 헤드가 새로 생성된 노드를 가리킴
			this.size++;					// 사이즈 증가
			return true;					// 추가 성공!
		}else {
			return false;					// 데이터 중복으로 인한 추가 실패!
		}
	}

	@Override
	public boolean remove(String data) {
		// TODO Auto-generated method stub
		Node previousNode = null;					// 현재 노드의 이전을 가리키는 노드
		Node currentNode = this.head;				// 현재 가리키는 노드
		boolean found = false;						// 데이터 탐색을 구분하는 변수
		
		while(currentNode != null && !found)		// 현재 노드가 널이 아니고 아직 못찾았다면 참입니다.
		{
			if(currentNode.getData().equals(data))	// 현재 노드와 제거할 데이터와 비교합니다.
			{
				found = true;						// 제거할 데이터 탐색 성공!
			}else {									// 데이터가 맞지 않는 경우
				previousNode = currentNode;			// 이전 노드를 현재 노드로 이동
				currentNode = currentNode.getNext();// 현재 노드를 다음 노드로 이동
			}
		}
		
		if(!found)	// 제거할 데이터가 set 연결리스트에 없습니다.
		{
			return false;
		}else {
			if(currentNode==this.head)	// 찾은 노드가 헤드 노드이면 
			{
				this.head = this.head.getNext();	// 헤드는 제거할 데이터 노드의 다음 노드를 가리킵니다.(제거할 데이터 삭제수행)
			}else {						// 찾은 노드가 헤드 노드가 아니면
				previousNode.setNext(currentNode.getNext());	// 이전 노드는 현재 노드의 다음 노드를 가리킵니다.
			}
			this.size--;	// 사이즈 감소
			return true;	// 제거 성공!
		}
		
	}

	@Override
	public boolean contains(String data) {
		// TODO Auto-generated method stub
		Node searchNode = this.head;				
		while(searchNode != null)					// 연결리스트에 노드가 있다면 탐색을 시작합니다.
		{
			if(searchNode.getData().equals(data))	// 노드에 있는 데이터와 매개변수 데이터를 비교합니다.
			{
				return true;						// 연결리스트에 포함 되어있습니다.
			}
			searchNode = searchNode.getNext();		// 다음 노드로 이동합니다.
		}
		return false;								// 매개 변수 데이터는 연결리스트에 포함되어 있지 않습니다.
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;	// 사이즈를 반환합니다.
	}

	@Override
	public String checkNode() {
		// TODO Auto-generated method stub
		String content = "";			// 노드들의 데이터를 연결할 변수
		Node searchNode = this.head;	
		
		while(searchNode !=null)		// 연결리스트에 노드가 있으면 탐색 시작
		{
			content += searchNode.getData();	// 변수에 데이터를 추가한다.
			content += " ";						
			
			searchNode = searchNode.getNext();	// 다음 노드로 이동한다.
		}
		
		return content; // 노드들의 데이터를 리턴한다.
	}

	@Override
	public boolean swap(int i, int j) {
		// TODO Auto-generated method stub
		
		Node Node_i = this.head;		// i번째 노드를 담는 노드		
		Node Node_j = this.head;		// j번째 노드를 담는 노드
		Node Node_i_before = null;		// i-1번째 노드를 담는 노드
		Node Node_j_before = null;		// j-1번째 노드를 담는 노드
		Node temp = null;				// swap을 위한 임시 노드
		
		// 연결리스트에서 i번째 노드를 탐색합니다.
		for(int k=1;k<i;k++)
		{
			Node_i_before = Node_i;
			Node_i = Node_i.getNext();
			
		}
		
		// 연결리스트에서 j번째 노드를 탐색합니다.
		for(int k=1;k<j;k++)
		{
			Node_j_before = Node_j;
			Node_j = Node_j.getNext();
		}
		
		// i와 j의 입력의 순서를 관계없게 하기 위해서 조건문을 설정합니다.
		if(i<j)
		{
			if(i==1 && i==j-1)	// i가 head이고 j가 head 다음 노드인 경우
			{
				this.head = Node_j;					// 리스트의 첫번째를 Node_j번째를 가리킵니다.
				Node_i.setNext(Node_j.getNext());	// 노드 j가 다음 노드를 가리키는 곳을 가리킵니다.
				Node_j.setNext(Node_i);				// 노드 i를 가리킵니다.
					
			}else if(i==1){	// i가 head인 경우, j가 head 다음 노드가 아닌 경우
				this.head = Node_j;					 
				temp = Node_i.getNext();			// 노드 i번째의 다음 노드를 임시변수에 저장합니다.
				Node_i.setNext(Node_j.getNext());
				Node_j_before.setNext(Node_i);		// 노드 j-1번째의 다음노드를 i번째 노드로 가리킵니다.
				Node_j.setNext(temp);				// j번째 노드를 i의 다음노드로 가리킵니다.
			}else {	// i,j 모두 head가 아닌 경우
				Node_i.setNext(Node_j.getNext());
				Node_j.setNext(Node_i_before.getNext());	// j번째 노드가 i번째 노드를 가리킵니다.
				Node_i_before.setNext(Node_j);				// i-1번째 노드가 j번째 노드를 가리킵니다.
			}
			return true;	// swap 성공!
		}else if(i>j)	// i가 더 큰 경우 if문의 참인 경우와 반대로 수행된다.
		{
			if(j==1 && j==i-1)	// i가 head이고 j가 head 다음 노드인 경우
			{
				this.head = Node_i;
				Node_j.setNext(Node_i.getNext());
				Node_i.setNext(Node_j);
					
			}else if(j==1){	// i가 head인 경우, j가 head 다음 노드가 아닌 경우
				this.head = Node_i;
				temp = Node_j.getNext();
				Node_j.setNext(Node_i.getNext());
				Node_i_before.setNext(Node_j);
				Node_i.setNext(temp);
			}else {	// i,j 모두 head가 아닌 경우
				Node_j.setNext(Node_i.getNext());
				Node_i.setNext(Node_j_before.getNext());
				Node_j_before.setNext(Node_i);
			}
			return true;	// swap 성공!
		}else {	// i와 j가 동일한 경우 swap 실패로 false 반환합니다.
			return false;	
		}	
	}
}
