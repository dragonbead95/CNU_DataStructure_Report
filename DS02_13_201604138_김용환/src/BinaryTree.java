public class BinaryTree {
	private Object root;
	BinaryTree left,right,parent;
	// 이진 트리 노드 생성자
	public BinaryTree(Object root)
	{
		this.root = root;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
	
	// 이진 트리 노드 구조 메소드
	public String toString()
	{
		StringBuffer buf = new StringBuffer("[");
		if(left !=null)
			buf.append(left + ",");
		buf.append(root);
		if(right !=null)
			buf.append("," + right);
		return buf + "]";
	}
	
	// 트리의 각 노드들을 순회하며 이진트리인지 검사하는 메소드
	public boolean isBST()	
	{
		Comparable key = (Comparable)root;	// key값 설정
		
		if(this==null)	// 공백 트리인 경우 true값을 반환합니다.
		{
			return true;
		}else if(this.left != null)	// left 노드가 null이 아니면 검사합니다.
		{
			// key값과 left 노드의 root값을 비교합니다.
			// left 노드의 root값이 크다면 false를 반환합니다.
			if(key.compareTo(this.left.getter())<0) {
				return false;
			}else {// left노드와 right노드의 존재 여부를 검사합니다.
				
				//left와 right 노드가 둘다 존재하는 경우
				if(this.left!=null && this.right!=null)
				{
					// left와 right 노드 전부 순회검사합니다.
					// 두 반환값 전부 true이면 true를 반환합니다.
					return (this.left.isBST() && this.right.isBST());
				}
				// right 노드만 존재하는 경우
				else if(this.left ==null && this.right!=null)
				{
					return this.right.isBST();	// right 노드를 순회검사합니다.
				}
				// left 노드만 존재하는 경우
				else if(this.left != null && this.right ==null)
				{
					return this.left.isBST();	// left 노드를 순회검사합니다.
				}
				// left와 right 노드 둘다 존재하지 않는 경우
				else {
					return true;	// 이진 트리 노드가 맞습니다.
				}
			}
		}else if(this.right != null)	// right가 null이 아니면 검사합니다.
		{
			// key값과 right 노드의 root값을 비교합니다.
			// right 노드의 root값이 작다면 false를 반환합니다.
			if(key.compareTo(this.right.getter())>0) {
				return false;
			}else {// left노드와 right노드의 존재 여부를 검사합니다.
				
				//left와 right 노드가 둘다 존재하는 경우
				if(this.left!=null && this.right!=null)
				{
					// left와 right 노드를 순회검사합니다.
					// 두 반환값 전부 true이면 true를 반환합니다
					return (this.left.isBST() && this.right.isBST());
				}
				// right 노드만 존재하는 경우
				else if(this.left ==null && this.right!=null)
				{
					return this.right.isBST();	// right 노드를 순회검사합니다.
				}
				// left 노드만 존재하는 경우
				else if(this.left != null && this.right ==null)
				{
					return this.left.isBST();	// left 노드를 순회검사합니다.
				}
				// left,right 노드 전부 존재하지 않는 경우
				else {
					return true;
				}
			}
		}else {	// 노드가 단독 트리인 경우
			return true;
		}
				
	}
	
	// 새로운 데이터값을 삽입합니다.
	public void insertKey(Object data)
	{
		Comparable key = (Comparable)root;
		
		// key값과 data값을 비교하여 data값이 큰 경우
		if(key.compareTo(data)<0) {
			this.parent = this;
			if(this.right != null)			// right 노드가 null이 아닌 경우
				this.right.insertKey(data);	// right 노드를 순회하여 빈자리를 찾습니다.
			else {							// right 노드가 비었으면 삽입합니다.
				this.right = new BinaryTree(data);
			}
		}
		// key값과 data값을 비교하여 data값이 작은 경우
		else if(key.compareTo(data)>0) {
			this.parent = this;
			if(this.left != null)			// left 노드가 null이 아닌 경우
				this.left.insertKey(data);	// left 노드를 순회하여 빈자리를 찾습니다.
			else {							// left 노드가 비었으면 삽입합니다.
				this.left = new BinaryTree(data);
			}
		}
	}
	
	public Object getter()
	{
		return this.root;	// root 값 반환
	}
	
	public void setter(Object data)
	{
		this.root = data;	// root 값 설정
	}
	
}
