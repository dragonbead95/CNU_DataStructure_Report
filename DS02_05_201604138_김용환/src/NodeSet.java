
public class NodeSet implements Set{

	private Node head;	// ���Ḯ��Ʈ�� ������ ��Ÿ���� ���
	private int size;	// ���Ḯ��Ʈ�� ������ ���� ����
	
	@Override
	public boolean add(String data) {
		// TODO Auto-generated method stub
		if(!this.contains(data))	// �������� �ߺ� Ȯ��
		{
			Node newNode = new Node(data);	// �� ��� ����
			newNode.setNext(this.head);		// ��尡 ����Ű�� ��带 ����Ŵ
			this.head = newNode;			// ��尡 ���� ������ ��带 ����Ŵ
			this.size++;					// ������ ����
			return true;					// �߰� ����!
		}else {
			return false;					// ������ �ߺ����� ���� �߰� ����!
		}
	}

	@Override
	public boolean remove(String data) {
		// TODO Auto-generated method stub
		Node previousNode = null;					// ���� ����� ������ ����Ű�� ���
		Node currentNode = this.head;				// ���� ����Ű�� ���
		boolean found = false;						// ������ Ž���� �����ϴ� ����
		
		while(currentNode != null && !found)		// ���� ��尡 ���� �ƴϰ� ���� ��ã�Ҵٸ� ���Դϴ�.
		{
			if(currentNode.getData().equals(data))	// ���� ���� ������ �����Ϳ� ���մϴ�.
			{
				found = true;						// ������ ������ Ž�� ����!
			}else {									// �����Ͱ� ���� �ʴ� ���
				previousNode = currentNode;			// ���� ��带 ���� ���� �̵�
				currentNode = currentNode.getNext();// ���� ��带 ���� ���� �̵�
			}
		}
		
		if(!found)	// ������ �����Ͱ� set ���Ḯ��Ʈ�� �����ϴ�.
		{
			return false;
		}else {
			if(currentNode==this.head)	// ã�� ��尡 ��� ����̸� 
			{
				this.head = this.head.getNext();	// ���� ������ ������ ����� ���� ��带 ����ŵ�ϴ�.(������ ������ ��������)
			}else {						// ã�� ��尡 ��� ��尡 �ƴϸ�
				previousNode.setNext(currentNode.getNext());	// ���� ���� ���� ����� ���� ��带 ����ŵ�ϴ�.
			}
			this.size--;	// ������ ����
			return true;	// ���� ����!
		}
		
	}

	@Override
	public boolean contains(String data) {
		// TODO Auto-generated method stub
		Node searchNode = this.head;				
		while(searchNode != null)					// ���Ḯ��Ʈ�� ��尡 �ִٸ� Ž���� �����մϴ�.
		{
			if(searchNode.getData().equals(data))	// ��忡 �ִ� �����Ϳ� �Ű����� �����͸� ���մϴ�.
			{
				return true;						// ���Ḯ��Ʈ�� ���� �Ǿ��ֽ��ϴ�.
			}
			searchNode = searchNode.getNext();		// ���� ���� �̵��մϴ�.
		}
		return false;								// �Ű� ���� �����ʹ� ���Ḯ��Ʈ�� ���ԵǾ� ���� �ʽ��ϴ�.
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;	// ����� ��ȯ�մϴ�.
	}

	@Override
	public String checkNode() {
		// TODO Auto-generated method stub
		String content = "";			// ������ �����͸� ������ ����
		Node searchNode = this.head;	
		
		while(searchNode !=null)		// ���Ḯ��Ʈ�� ��尡 ������ Ž�� ����
		{
			content += searchNode.getData();	// ������ �����͸� �߰��Ѵ�.
			content += " ";						
			
			searchNode = searchNode.getNext();	// ���� ���� �̵��Ѵ�.
		}
		
		return content; // ������ �����͸� �����Ѵ�.
	}

	@Override
	public boolean swap(int i, int j) {
		// TODO Auto-generated method stub
		
		Node Node_i = this.head;		// i��° ��带 ��� ���		
		Node Node_j = this.head;		// j��° ��带 ��� ���
		Node Node_i_before = null;		// i-1��° ��带 ��� ���
		Node Node_j_before = null;		// j-1��° ��带 ��� ���
		Node temp = null;				// swap�� ���� �ӽ� ���
		
		// ���Ḯ��Ʈ���� i��° ��带 Ž���մϴ�.
		for(int k=1;k<i;k++)
		{
			Node_i_before = Node_i;
			Node_i = Node_i.getNext();
			
		}
		
		// ���Ḯ��Ʈ���� j��° ��带 Ž���մϴ�.
		for(int k=1;k<j;k++)
		{
			Node_j_before = Node_j;
			Node_j = Node_j.getNext();
		}
		
		// i�� j�� �Է��� ������ ������� �ϱ� ���ؼ� ���ǹ��� �����մϴ�.
		if(i<j)
		{
			if(i==1 && i==j-1)	// i�� head�̰� j�� head ���� ����� ���
			{
				this.head = Node_j;					// ����Ʈ�� ù��°�� Node_j��°�� ����ŵ�ϴ�.
				Node_i.setNext(Node_j.getNext());	// ��� j�� ���� ��带 ����Ű�� ���� ����ŵ�ϴ�.
				Node_j.setNext(Node_i);				// ��� i�� ����ŵ�ϴ�.
					
			}else if(i==1){	// i�� head�� ���, j�� head ���� ��尡 �ƴ� ���
				this.head = Node_j;					 
				temp = Node_i.getNext();			// ��� i��°�� ���� ��带 �ӽú����� �����մϴ�.
				Node_i.setNext(Node_j.getNext());
				Node_j_before.setNext(Node_i);		// ��� j-1��°�� ������带 i��° ���� ����ŵ�ϴ�.
				Node_j.setNext(temp);				// j��° ��带 i�� �������� ����ŵ�ϴ�.
			}else {	// i,j ��� head�� �ƴ� ���
				Node_i.setNext(Node_j.getNext());
				Node_j.setNext(Node_i_before.getNext());	// j��° ��尡 i��° ��带 ����ŵ�ϴ�.
				Node_i_before.setNext(Node_j);				// i-1��° ��尡 j��° ��带 ����ŵ�ϴ�.
			}
			return true;	// swap ����!
		}else if(i>j)	// i�� �� ū ��� if���� ���� ���� �ݴ�� ����ȴ�.
		{
			if(j==1 && j==i-1)	// i�� head�̰� j�� head ���� ����� ���
			{
				this.head = Node_i;
				Node_j.setNext(Node_i.getNext());
				Node_i.setNext(Node_j);
					
			}else if(j==1){	// i�� head�� ���, j�� head ���� ��尡 �ƴ� ���
				this.head = Node_i;
				temp = Node_j.getNext();
				Node_j.setNext(Node_i.getNext());
				Node_i_before.setNext(Node_j);
				Node_i.setNext(temp);
			}else {	// i,j ��� head�� �ƴ� ���
				Node_j.setNext(Node_i.getNext());
				Node_i.setNext(Node_j_before.getNext());
				Node_j_before.setNext(Node_i);
			}
			return true;	// swap ����!
		}else {	// i�� j�� ������ ��� swap ���з� false ��ȯ�մϴ�.
			return false;	
		}	
	}
}
