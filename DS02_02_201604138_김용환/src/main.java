/***********************************************************
 * ���� : ����ó�� ���α׷�
 * �ۼ��� : 2018-03-13
 * �ۼ��� : ���ȯ
 * ���� : �л��� ������ �Է��ϰ� �� �л��� ���� ������ �Է��ϰ� ����ϴ� ���α׷�
 ***********************************************************/
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student;	// �л� ��ü
		Section section;	// ������ ��ü
		Grade grade;		// ���� ��ü
		
		// �л� ��ü ����
		student = new myStudent("���ȯ",true,1995);	
		
		// �л� ��ü�� ���� ����� �����Է�
		section = new mySection("�ڷᱸ��");	
		grade = new myGrade("A");
		student.updateTranscript(section,grade);
		
		section = new mySection("��ȸ��");
		grade = new myGrade("B+");
		student.updateTranscript(section, grade);
		
		// �л��� �̸��� �������� ���
		System.out.print(student.getName() + " "); 
		student.printTranscript();
	}

}
