
public interface Student {
	/*�л��� �̸��� ��ȯ�Ѵ�*/
	public String getName();
	
	/*�л��� ����� ������ map�� �ִ´�*/
	public void updateTranscript(Section section, Grade grade);
	
	/*�л��� ���� ������� ������ ����Ѵ�*/
	public void printTranscript();
}
