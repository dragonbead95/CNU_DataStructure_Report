
public class TestBinaryTree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree treeB = new BinaryTree("B");	// B��� ����
		BinaryTree treeD = new BinaryTree("D");	// D��� ����
		BinaryTree treeE = new BinaryTree("E");	// E��� ����
		BinaryTree treeC = new BinaryTree("C",treeD,treeE); // ���� ��� D, ������ ��� E ����
		BinaryTree treeA = new BinaryTree("A",treeB,treeC);	// ���� ��� B, ������ ��� C ���� 
		BinaryTree treeX = new BinaryTree("X");				// X��� ����
		BinaryTree treeY = new BinaryTree("Y",treeA,treeX);	// ���� ��� A, ������ ��� X ����
		System.out.println("treeY: " + treeY);	// Ʈ���� ���� ���
		treeY.preorderPrint();	// ���� ��ȸ ���
		System.out.println();
		treeY.InorderPrint();	// ���� ��ȸ ���
		System.out.println();
		treeY.postorderPrint();	// ���� ��ȸ ���
	}
}
