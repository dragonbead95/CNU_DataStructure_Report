
public class myGrade implements Grade {
	private String value;	// �����ڿ��� �������� ���� ����
	
	/* myGrade�� �����ڷ� value���� �����Ѵ�. */
	public myGrade(String value)
	{
		this.value = value;
	}
	
	/*section�� ���� �������� ��ȯ�Ѵ�.*/
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return value; 
	}
	
	// map���� ���� �����͸� �����Ҷ� ��ȯ�� �޼ҵ�
	public String toString()
	{
		return value;
	}
}
