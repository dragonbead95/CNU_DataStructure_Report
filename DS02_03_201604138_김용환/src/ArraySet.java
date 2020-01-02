public class ArraySet implements Set{
	private Object[] objects = new Object[1000];
	private int size,i;
	
	/**
	 * object를 추가하는 메서드로써 기존에 있는 set 배열을 탐색하면서
	 * 중복되는 데이터가 있는지 검사하고 중복되는 데이터가 있으면 false를 반환하고
	 * 중복되는 데이터 없으면 인덱스 0번째 자리부터 object들을 채워넣고 true를 반환한다.
	 */
	@Override
	public boolean add(Object object) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			if(objects[i].equals(object))
			{
				return false;
			}
		}
		objects[size++]=object;
		return true;
	}

	/**
	 * 확인하고픈 object를 매개변수로 받아 objects 배열을
	 * 탐색하며 object랑 동일한 것이 있는지 반복문을 실행
	 * 동일한 데이터가 있으면 true 반환
	 * 없으면 false 반환
	 */
	@Override
	public boolean contains(Object object) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			if(objects[i].equals(object))
			{
				return true;
			}
				
		}
		return false;
	}

	/**
	 * obects 배열의 첫번째 인덱스에 해당하는 데이터 값을 반환한다.
	 */
	@Override
	public Object getFirst() {
		// TODO Auto-generated method stub
		i = 0;
		return objects[i++];
	}

	/**
	 * objects 배열의 첫번째 인덱스 바로 다음부터 해당하는
	 * 데이터 값을 반환한다.
	 */
	@Override
	public Object getNext() {
		// TODO Auto-generated method stub
		return objects[i++];
	}

	/**
	 * objects 배열을 탐색하며 삭제하고자 하는 데이터가 있는지 탐색한다.
	 * 있으면 배열을 한칸씩 땡기게 되고, arraycopy로 인해 기존에 남아있던 마지막 데이터값을
	 * null로 만들어주고 삭제가 성공한 true를 반환한다.
	 */
	@Override
	public boolean remove(Object object) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<size;i++)
		{
			if(objects[i].equals(object))
			{
				System.arraycopy(objects, i+1, objects, i, size-i-1);
				objects[--size] = null;
				return true;
			}
		}
		
		return false;
	}

	/**
	 * objects 배열의 사이즈를 반환한다.
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
}
