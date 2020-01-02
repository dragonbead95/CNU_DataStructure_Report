
public interface Set {
	/**
	 * set�� �������� �߰�
	 * ���������� �ߺ��Ǹ� �ȵǱ� ������ �ߺ����� true/false ��ȯ
	 * @param object
	 * @return boolean
	 */
	public boolean add(Object object);
	
	/**
	 * ã�� ���빰�� ������ true, ������ false�� ��ȯ
	 * @param object
	 * @return boolean
	 */
	public boolean contains(Object object);

	/**
	 * ó�� ����ִ� ���빰 Ȯ�� 
	 * @return Object
	 */
	public Object getFirst();
	
	/**
	 * ���� ���빰 Ȯ��
	 * @return Object
	 */
	public Object getNext();
	
	/**
	 * �ش� ���빰 ����
	 * @param object
	 * @return boolean
	 */
	public boolean remove(Object object);
	
	/**
	 * set ũ�� Ȯ��
	 * @return int
	 */
	public int size();
	
}
