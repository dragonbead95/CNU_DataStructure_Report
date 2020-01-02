/***********************************************************
 * 제목 : 성적처리 프로그램
 * 작성일 : 2018-03-13
 * 작성자 : 김용환
 * 참고 : 학생의 정보를 입력하고 그 학생에 대한 성적을 입력하고 출력하는 프로그램
 ***********************************************************/
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student;	// 학생 객체
		Section section;	// 교과목 객체
		Grade grade;		// 성적 객체
		
		// 학생 객체 생성
		student = new myStudent("김용환",true,1995);	
		
		// 학생 객체에 넣을 과목과 성적입력
		section = new mySection("자료구조");	
		grade = new myGrade("A");
		student.updateTranscript(section,grade);
		
		section = new mySection("논리회로");
		grade = new myGrade("B+");
		student.updateTranscript(section, grade);
		
		// 학생의 이름과 성적정보 출력
		System.out.print(student.getName() + " "); 
		student.printTranscript();
	}

}
