
public class TestBinaryTree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree treeB = new BinaryTree("B");	// B노드 설정
		BinaryTree treeD = new BinaryTree("D");	// D노드 설정
		BinaryTree treeE = new BinaryTree("E");	// E노드 설정
		BinaryTree treeC = new BinaryTree("C",treeD,treeE); // 왼쪽 노드 D, 오른쪽 노드 E 설정
		BinaryTree treeA = new BinaryTree("A",treeB,treeC);	// 왼쪽 노드 B, 오른쪽 노드 C 설정 
		BinaryTree treeX = new BinaryTree("X");				// X노드 설정
		BinaryTree treeY = new BinaryTree("Y",treeA,treeX);	// 왼쪽 노드 A, 오른쪽 노드 X 설정
		System.out.println("treeY: " + treeY);	// 트리의 구성 출력
		treeY.preorderPrint();	// 전위 순회 출력
		System.out.println();
		treeY.InorderPrint();	// 중위 순회 출력
		System.out.println();
		treeY.postorderPrint();	// 후위 순회 출력
	}
}
