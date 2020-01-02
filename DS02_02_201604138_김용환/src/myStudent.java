import java.util.HashMap;
import java.util.Map;

public class myStudent implements Student {
	private String name;		// 학생의 이름
	private boolean male;		// 학생의 성별
	private int yob;			// 학생의 생년월일의 연도
	private final Transcript transcript = new Transcript();	// 성적 정보 처리 클래스
	
	/* myStudent의 생성자로써 학생의 이름,성별,연도를 입력받아 저장한다. */
	public myStudent(String name, boolean male,int yob)
	{
		this.name = name;
		this.male = male;
		this.yob = yob;	
	}
	
	/* 학생의 이름을 반환한다. */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	/*map을 이용해서 교과목과 학점을 입력한다*/
	@Override
	public void updateTranscript(Section section,Grade grade) {
		// TODO Auto-generated method stub
		transcript.add(section,grade);
	}

	/*map에서 학생에 대한 교과목과 학점을 출력한다.*/
	@Override
	public void printTranscript() {
		// TODO Auto-generated method stub
		System.out.println(transcript);
	}
	
	/* 학생의 정보를 입력하는 클래스 */
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

