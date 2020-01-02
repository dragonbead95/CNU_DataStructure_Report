public class BinaryTree {
	private Object root;
	BinaryTree left,right,parent;
	// ���� Ʈ�� ��� ������
	public BinaryTree(Object root)
	{
		this.root = root;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
	
	// ���� Ʈ�� ��� ���� �޼ҵ�
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
	
	// Ʈ���� �� ������ ��ȸ�ϸ� ����Ʈ������ �˻��ϴ� �޼ҵ�
	public boolean isBST()	
	{
		Comparable key = (Comparable)root;	// key�� ����
		
		if(this==null)	// ���� Ʈ���� ��� true���� ��ȯ�մϴ�.
		{
			return true;
		}else if(this.left != null)	// left ��尡 null�� �ƴϸ� �˻��մϴ�.
		{
			// key���� left ����� root���� ���մϴ�.
			// left ����� root���� ũ�ٸ� false�� ��ȯ�մϴ�.
			if(key.compareTo(this.left.getter())<0) {
				return false;
			}else {// left���� right����� ���� ���θ� �˻��մϴ�.
				
				//left�� right ��尡 �Ѵ� �����ϴ� ���
				if(this.left!=null && this.right!=null)
				{
					// left�� right ��� ���� ��ȸ�˻��մϴ�.
					// �� ��ȯ�� ���� true�̸� true�� ��ȯ�մϴ�.
					return (this.left.isBST() && this.right.isBST());
				}
				// right ��常 �����ϴ� ���
				else if(this.left ==null && this.right!=null)
				{
					return this.right.isBST();	// right ��带 ��ȸ�˻��մϴ�.
				}
				// left ��常 �����ϴ� ���
				else if(this.left != null && this.right ==null)
				{
					return this.left.isBST();	// left ��带 ��ȸ�˻��մϴ�.
				}
				// left�� right ��� �Ѵ� �������� �ʴ� ���
				else {
					return true;	// ���� Ʈ�� ��尡 �½��ϴ�.
				}
			}
		}else if(this.right != null)	// right�� null�� �ƴϸ� �˻��մϴ�.
		{
			// key���� right ����� root���� ���մϴ�.
			// right ����� root���� �۴ٸ� false�� ��ȯ�մϴ�.
			if(key.compareTo(this.right.getter())>0) {
				return false;
			}else {// left���� right����� ���� ���θ� �˻��մϴ�.
				
				//left�� right ��尡 �Ѵ� �����ϴ� ���
				if(this.left!=null && this.right!=null)
				{
					// left�� right ��带 ��ȸ�˻��մϴ�.
					// �� ��ȯ�� ���� true�̸� true�� ��ȯ�մϴ�
					return (this.left.isBST() && this.right.isBST());
				}
				// right ��常 �����ϴ� ���
				else if(this.left ==null && this.right!=null)
				{
					return this.right.isBST();	// right ��带 ��ȸ�˻��մϴ�.
				}
				// left ��常 �����ϴ� ���
				else if(this.left != null && this.right ==null)
				{
					return this.left.isBST();	// left ��带 ��ȸ�˻��մϴ�.
				}
				// left,right ��� ���� �������� �ʴ� ���
				else {
					return true;
				}
			}
		}else {	// ��尡 �ܵ� Ʈ���� ���
			return true;
		}
				
	}
	
	// ���ο� �����Ͱ��� �����մϴ�.
	public void insertKey(Object data)
	{
		Comparable key = (Comparable)root;
		
		// key���� data���� ���Ͽ� data���� ū ���
		if(key.compareTo(data)<0) {
			this.parent = this;
			if(this.right != null)			// right ��尡 null�� �ƴ� ���
				this.right.insertKey(data);	// right ��带 ��ȸ�Ͽ� ���ڸ��� ã���ϴ�.
			else {							// right ��尡 ������� �����մϴ�.
				this.right = new BinaryTree(data);
			}
		}
		// key���� data���� ���Ͽ� data���� ���� ���
		else if(key.compareTo(data)>0) {
			this.parent = this;
			if(this.left != null)			// left ��尡 null�� �ƴ� ���
				this.left.insertKey(data);	// left ��带 ��ȸ�Ͽ� ���ڸ��� ã���ϴ�.
			else {							// left ��尡 ������� �����մϴ�.
				this.left = new BinaryTree(data);
			}
		}
	}
	
	public Object getter()
	{
		return this.root;	// root �� ��ȯ
	}
	
	public void setter(Object data)
	{
		this.root = data;	// root �� ����
	}
	
}
