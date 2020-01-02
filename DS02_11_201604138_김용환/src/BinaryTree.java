public class BinaryTree {
	private Object root;			// 노드의 데이터
	private BinaryTree left,right;	// 이진트리의 왼쪽, 오른쪽 노드
	
	public BinaryTree(Object root)
	{
		this.root = root;			// 노드의 데이터 설정
	}
	
	public BinaryTree(Object root, BinaryTree left, BinaryTree right)
	{
		this(root);					// 노드의 데이터 설정
		if(left != null) this.left = left;		// 노드의 왼쪽에 서브트리 연결
		if(right != null) this.right = right;	// 노드의 오른쪽에 서브트리 연결
	}
	
	public String toString()
	{
		StringBuffer buf = new StringBuffer("[");
		if(left != null) buf.append(left + ",");	// left의 toString() 함수값 반환
		buf.append(root);							// 노드의 데이터 삽입
		if(right != null) buf.append("," + right);	// right의 toString() 함수값 반환
		return buf + "]";
	}
	
	// 루트 노드를 먼저 방문하고 왼쪽 노드, 오른쪽 노드 순으로 순회하는 전위순회 함수
	public void preorderPrint()
	{
		// 노드의 데이터가 있는지 확인하는 조건문
		if(root != null)
		{
			System.out.print(root + " ");	// 노드의 데이터 출력
			
			if(left != null)			// 노드의 왼쪽 노드가 있는지 확인하는 조건문
				left.preorderPrint();	// 노드의 왼쪽 노드에서 다시 한번 preorderPrint() 순환함수 실행
			
			if(right != null)			// 노드의 오른쪽 노드가 있는지 확인하는 조건문
				right.preorderPrint();	// 노드의 오른쪽 노드에서 다시 한번 preorderPrint() 순환함수 실행
		}
	}
	
	// 왼쪽 노드를 먼저 방문하고 루트 노드, 오른쪽 노드 순으로 순회하는 중위순회 함수
	public void InorderPrint()
	{
		// 노드의 데이터가 있는지 확인하는 조건문
		if(root != null)
		{
			if(left != null)			// 노드의 왼쪽 노드가 있는지 확인하는 조건문
				left.InorderPrint();	// 노드의 왼쪽 노드에서 다시 한번 preorderPrint() 순환함수 실행
			
			System.out.print(root + " ");	// 노드의 데이터 출력
			
			if(right != null)			// 노드의 오른쪽 노드가 있는지 확인하는 조건문
				right.InorderPrint();	// 노드의 오른쪽 노드에서 다시 한번 preorderPrint() 순환함수 실행
		}
	}
	
	// 왼쪽 노드를 먼저 방문하고 오른쪽 노드, 루트 노드 순으로 순회하는 후위순회 함수
	public void postorderPrint()
	{
		// 노드의 데이터가 있는지 확인하는 조건문
		if(root != null)
		{
			if(left != null)			// 노드의 왼쪽 노드가 있는지 확인하는 조건문
				left.postorderPrint();	// 노드의 왼쪽 노드에서 다시 한번 preorderPrint() 순환함수 실행
			
			if(right != null)			// 노드의 오른쪽 노드가 있는지 확인하는 조건문
				right.postorderPrint();	// 노드의 오른쪽 노드에서 다시 한번 preorderPrint() 순환함수 실행
			
			System.out.print(root + " ");	// 노드의 데이터 출력
		}
	}
}
