
public interface Set {
	public boolean add(String data);		// 노드 추가
	public boolean remove(String data);		// 노드 제거
	public boolean contains(String data);	// 데이터가 포함되어 있는지 확인
	public boolean swap(int i, int j);		// 교환
	public int size();						// 노드 갯수 반환
	public String checkNode();				// 연결리스트 노드 데이터 확인
}
