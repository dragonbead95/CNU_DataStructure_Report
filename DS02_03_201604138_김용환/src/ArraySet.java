public class ArraySet implements Set{
	private Object[] objects = new Object[1000];
	private int size,i;
	
	/**
	 * object�� �߰��ϴ� �޼���ν� ������ �ִ� set �迭�� Ž���ϸ鼭
	 * �ߺ��Ǵ� �����Ͱ� �ִ��� �˻��ϰ� �ߺ��Ǵ� �����Ͱ� ������ false�� ��ȯ�ϰ�
	 * �ߺ��Ǵ� ������ ������ �ε��� 0��° �ڸ����� object���� ä���ְ� true�� ��ȯ�Ѵ�.
	 */
	@Override
	public boolean add(Object object) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			if(objects[i].equals(object))
			{
				return false;
			}
		}
		objects[size++]=object;
		return true;
	}

	/**
	 * Ȯ���ϰ��� object�� �Ű������� �޾� objects �迭��
	 * Ž���ϸ� object�� ������ ���� �ִ��� �ݺ����� ����
	 * ������ �����Ͱ� ������ true ��ȯ
	 * ������ false ��ȯ
	 */
	@Override
	public boolean contains(Object object) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			if(objects[i].equals(object))
			{
				return true;
			}
				
		}
		return false;
	}

	/**
	 * obects �迭�� ù��° �ε����� �ش��ϴ� ������ ���� ��ȯ�Ѵ�.
	 */
	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		i = 0;
		return objects[i++];
	}

	/**
	 * objects �迭�� ù��° �ε��� �ٷ� �������� �ش��ϴ�
	 * ������ ���� ��ȯ�Ѵ�.
	 */
	@Override
	public Object getNext() {
		// TODO Auto-generated method stub
		return objects[i++];
	}

	/**
	 * objects �迭�� Ž���ϸ� �����ϰ��� �ϴ� �����Ͱ� �ִ��� Ž���Ѵ�.
	 * ������ �迭�� ��ĭ�� ����� �ǰ�, arraycopy�� ���� ������ �����ִ� ������ �����Ͱ���
	 * null�� ������ְ� ������ ������ true�� ��ȯ�Ѵ�.
	 */
	@Override
	public boolean remove(Object object) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<size;i++)
		{
			if(objects[i].equals(object))
			{
				System.arraycopy(objects, i+1, objects, i, size-i-1);
				objects[--size] = null;
				return true;
			}
		}
		
		return false;
	}

	/**
	 * objects �迭�� ����� ��ȯ�Ѵ�.
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
}
