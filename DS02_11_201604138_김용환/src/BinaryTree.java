public class BinaryTree {
	private Object root;			// ����� ������
	private BinaryTree left,right;	// ����Ʈ���� ����, ������ ���
	
	public BinaryTree(Object root)
	{
		this.root = root;			// ����� ������ ����
	}
	
	public BinaryTree(Object root, BinaryTree left, BinaryTree right)
	{
		this(root);					// ����� ������ ����
		if(left != null) this.left = left;		// ����� ���ʿ� ����Ʈ�� ����
		if(right != null) this.right = right;	// ����� �����ʿ� ����Ʈ�� ����
	}
	
	public String toString()
	{
		StringBuffer buf = new StringBuffer("[");
		if(left != null) buf.append(left + ",");	// left�� toString() �Լ��� ��ȯ
		buf.append(root);							// ����� ������ ����
		if(right != null) buf.append("," + right);	// right�� toString() �Լ��� ��ȯ
		return buf + "]";
	}
	
	// ��Ʈ ��带 ���� �湮�ϰ� ���� ���, ������ ��� ������ ��ȸ�ϴ� ������ȸ �Լ�
	public void preorderPrint()
	{
		// ����� �����Ͱ� �ִ��� Ȯ���ϴ� ���ǹ�
		if(root != null)
		{
			System.out.print(root + " ");	// ����� ������ ���
			
			if(left != null)			// ����� ���� ��尡 �ִ��� Ȯ���ϴ� ���ǹ�
				left.preorderPrint();	// ����� ���� ��忡�� �ٽ� �ѹ� preorderPrint() ��ȯ�Լ� ����
			
			if(right != null)			// ����� ������ ��尡 �ִ��� Ȯ���ϴ� ���ǹ�
				right.preorderPrint();	// ����� ������ ��忡�� �ٽ� �ѹ� preorderPrint() ��ȯ�Լ� ����
		}
	}
	
	// ���� ��带 ���� �湮�ϰ� ��Ʈ ���, ������ ��� ������ ��ȸ�ϴ� ������ȸ �Լ�
	public void InorderPrint()
	{
		// ����� �����Ͱ� �ִ��� Ȯ���ϴ� ���ǹ�
		if(root != null)
		{
			if(left != null)			// ����� ���� ��尡 �ִ��� Ȯ���ϴ� ���ǹ�
				left.InorderPrint();	// ����� ���� ��忡�� �ٽ� �ѹ� preorderPrint() ��ȯ�Լ� ����
			
			System.out.print(root + " ");	// ����� ������ ���
			
			if(right != null)			// ����� ������ ��尡 �ִ��� Ȯ���ϴ� ���ǹ�
				right.InorderPrint();	// ����� ������ ��忡�� �ٽ� �ѹ� preorderPrint() ��ȯ�Լ� ����
		}
	}
	
	// ���� ��带 ���� �湮�ϰ� ������ ���, ��Ʈ ��� ������ ��ȸ�ϴ� ������ȸ �Լ�
	public void postorderPrint()
	{
		// ����� �����Ͱ� �ִ��� Ȯ���ϴ� ���ǹ�
		if(root != null)
		{
			if(left != null)			// ����� ���� ��尡 �ִ��� Ȯ���ϴ� ���ǹ�
				left.postorderPrint();	// ����� ���� ��忡�� �ٽ� �ѹ� preorderPrint() ��ȯ�Լ� ����
			
			if(right != null)			// ����� ������ ��尡 �ִ��� Ȯ���ϴ� ���ǹ�
				right.postorderPrint();	// ����� ������ ��忡�� �ٽ� �ѹ� preorderPrint() ��ȯ�Լ� ����
			
			System.out.print(root + " ");	// ����� ������ ���
		}
	}
}
