
public interface Student {
	/*학생의 이름을 반환한다*/
	public String getName();
	
	/*학생에 과목과 성적을 map에 넣는다*/
	public void updateTranscript(Section section, Grade grade);
	
	/*학생에 대한 교과목과 성적을 출력한다*/
	public void printTranscript();
}
