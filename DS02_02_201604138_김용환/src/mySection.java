
public class mySection implements Section {
	private String id;	// �����ڿ��� �������� ������ ����
	
	/*mySection�� �����ڷν� �������� �����Ѵ�.*/
	public mySection(String id)
	{
		this.id = id;
	}
	
	/* ������ �����Ͱ��� ��ȯ�Ѵ�.*/
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	/*map���� ������ �����͸� �����Ҷ� ��ȯ�� �޼ҵ� */
	public String toString()
	{
		return id;
	}

}
