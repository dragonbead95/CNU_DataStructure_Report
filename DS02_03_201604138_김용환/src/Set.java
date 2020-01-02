
public interface Set {
	/**
	 * set에 원소집합 추가
	 * 원소집합은 중복되면 안되기 때문에 중복여부 true/false 반환
	 * @param object
	 * @return boolean
	 */
	public boolean add(Object object);
	
	/**
	 * 찾는 내용물이 있으면 true, 없으면 false를 반환
	 * @param object
	 * @return boolean
	 */
	public boolean contains(Object object);

	/**
	 * 처음 들어있는 내용물 확인 
	 * @return Object
	 */
	public Object getFirst();
	
	/**
	 * 다음 내용물 확인
	 * @return Object
	 */
	public Object getNext();
	
	/**
	 * 해당 내용물 삭제
	 * @param object
	 * @return boolean
	 */
	public boolean remove(Object object);
	
	/**
	 * set 크기 확인
	 * @return int
	 */
	public int size();
	
}
