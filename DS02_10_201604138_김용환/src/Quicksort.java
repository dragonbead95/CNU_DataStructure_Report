
public class Quicksort {
	private int [] array;	// 정렬을 할 배열
	private int size, i;	// 원소의 갯수와 인덱스 번호
	private int maxSize;	// 배열의 크기
	
	public Quicksort(int maxSize)
	{
		array = new int[maxSize];	// 배열의 크기 설정
		size = 0;					// 원소의 갯수 초기화
		this.maxSize = maxSize;		// 배열의 크기 변수 초기화
	}
	
	public void quickSortRecursively(int left, int right)
	{
		// left가 right보다 작으면 분할정복 정렬을 한다.
		if(left<right) {
			int mid = partition(left,right);	// partition() 함수를 통해 mid값을 구한다.
			quickSortRecursively(left, mid-1);	// left ~ mid-1까지의 원소들을 정렬한다.
			quickSortRecursively(mid+1, right);	// mid+1 ~ right 까지 원소들을 정렬한다.
		}
	}
	
	public void sorting()
	{
		this.quickSortRecursively(0, size-1);	// 퀵정렬을 실행한다.
												// left=0, right=size-1로 대입
	}
	
	public int partition(int left, int right)
	{
		int pivot = left;	// 기준인덱스를 left로 설정한다.
		int data = this.array[pivot];	// 기준값을 초기화한다.
		right++;
		
		do {//설정된 기준값이 제자리를 찾을때까지 반복한다.
			
			// data와 배열원소들을 비교하면서 data보다 큰 left원소를 찾는다.
			// left<=right 는 left가 right보다 커지는 것을 방지한다.
			while((array[++left]<data) && (left<=right)) {}
			
			// data와 배열원소들을 비교하면서 data보다 작은 right원소를 찾는다.
			// (pivot+1<=right) 는 right가 pivot보다 작아지는 것을 방지한다.
			while((array[--right]>data) && (pivot+1<=right)) {}
			
			// right가 left보다 크면 두개의 원소를 교환한다.
			if(left<=right) {
				this.swap(left, right);
			}
		}while(left<right);
		
		// 기준값과 right 원소의 값을 교환한다.
		this.swap(pivot, right);

		return right;
	}
	
	// 배열에서 두개의 원소를 교환하는 함수입니다.
	public void swap(int a, int b)
	{
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public boolean add(int data)
	{
		// 배열이 가득차는 상황을 처리하는 예외처리 조건문입니다.
		if(size==maxSize) {
			System.out.println("배열이 가득 찼습니다.");
			return false;		// add 실패
		}
		else {
			array[i++] = data;	// 0부터 원소값들을 넣으면서 i를 증가시킵니다.
			++size;				// 원소 갯수 증가
			return true;		// add 성공
		}
	}
	
	// 배열에서 첫번째 원소를 출력합니다.
	public void getFirst()
	{
		i=0;
		System.out.print(array[i++]);	// getNext() 함수를 위해 i를 1 증가시켜줍니다.
	}
	
	// 배열에서 두번째 원소부터 마지막 원소까지 출력합니다.
	public void getNext()
	{
		// 인덱스 i가 배열에 존재하는 마지막 원소까지 반복합니다.
		while(i<size) {
			System.out.print(", "+array[i++]);	// 다음 원소를 위해 출력하고 i를 증가시킵니다.
		}
		System.out.println();
	}
	
	// 배열의 원소 갯수를 반환하는 함수입니다.
	public int size()
	{
		return size;
	}
}
