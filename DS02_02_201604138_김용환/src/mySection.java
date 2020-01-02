
public class mySection implements Section {
	private String id;	// 생성자에서 교과목을 설정할 변수
	
	/*mySection의 생성자로써 교과목을 저장한다.*/
	public mySection(String id)
	{
		this.id = id;
	}
	
	/* 교과목 데이터값을 반환한다.*/
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	/*map에서 교과목 데이터를 참조할때 반환할 메소드 */
	public String toString()
	{
		return id;
	}

}
