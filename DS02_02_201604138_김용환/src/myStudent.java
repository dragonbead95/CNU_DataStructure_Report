import java.util.HashMap;
import java.util.Map;

public class myStudent implements Student {
	private String name;		// �л��� �̸�
	private boolean male;		// �л��� ����
	private int yob;			// �л��� ��������� ����
	private final Transcript transcript = new Transcript();	// ���� ���� ó�� Ŭ����
	
	/* myStudent�� �����ڷν� �л��� �̸�,����,������ �Է¹޾� �����Ѵ�. */
	public myStudent(String name, boolean male,int yob)
	{
		this.name = name;
		this.male = male;
		this.yob = yob;	
	}
	
	/* �л��� �̸��� ��ȯ�Ѵ�. */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	/*map�� �̿��ؼ� ������� ������ �Է��Ѵ�*/
	@Override
	public void updateTranscript(Section section,Grade grade) {
		// TODO Auto-generated method stub
		transcript.add(section,grade);
	}

	/*map���� �л��� ���� ������� ������ ����Ѵ�.*/
	@Override
	public void printTranscript() {
		// TODO Auto-generated method stub
		System.out.println(transcript);
	}
	
	/* �л��� ������ �Է��ϴ� Ŭ���� */
	private class Transcript{
		Map map = new HashMap();
		void add(Section section, Grade grade)
		{
			map.put(section, grade);
		}
		
		public String toString()
		{
			return map.toString();
		}
	}

}

