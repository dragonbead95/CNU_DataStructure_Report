public interface IntStack {
	public boolean isEmpty();	// 스택이 비었는지 검사, 비었으면 참 리턴
	public int pop();			// 스택의 top에 있는 데이터를 추출
	public int popBottom();		// 스택의 Bottom에 있는 데이터 추출
	public void push(int n);	// 스택에 데이터를 삽입
	public int size();			// 스택의 데이터 갯수 출력
}
