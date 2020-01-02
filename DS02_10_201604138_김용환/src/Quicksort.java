
public class Quicksort {
	private int [] array;	// ������ �� �迭
	private int size, i;	// ������ ������ �ε��� ��ȣ
	private int maxSize;	// �迭�� ũ��
	
	public Quicksort(int maxSize)
	{
		array = new int[maxSize];	// �迭�� ũ�� ����
		size = 0;					// ������ ���� �ʱ�ȭ
		this.maxSize = maxSize;		// �迭�� ũ�� ���� �ʱ�ȭ
	}
	
	public void quickSortRecursively(int left, int right)
	{
		// left�� right���� ������ �������� ������ �Ѵ�.
		if(left<right) {
			int mid = partition(left,right);	// partition() �Լ��� ���� mid���� ���Ѵ�.
			quickSortRecursively(left, mid-1);	// left ~ mid-1������ ���ҵ��� �����Ѵ�.
			quickSortRecursively(mid+1, right);	// mid+1 ~ right ���� ���ҵ��� �����Ѵ�.
		}
	}
	
	public void sorting()
	{
		this.quickSortRecursively(0, size-1);	// �������� �����Ѵ�.
												// left=0, right=size-1�� ����
	}
	
	public int partition(int left, int right)
	{
		int pivot = left;	// �����ε����� left�� �����Ѵ�.
		int data = this.array[pivot];	// ���ذ��� �ʱ�ȭ�Ѵ�.
		right++;
		
		do {//������ ���ذ��� ���ڸ��� ã�������� �ݺ��Ѵ�.
			
			// data�� �迭���ҵ��� ���ϸ鼭 data���� ū left���Ҹ� ã�´�.
			// left<=right �� left�� right���� Ŀ���� ���� �����Ѵ�.
			while((array[++left]<data) && (left<=right)) {}
			
			// data�� �迭���ҵ��� ���ϸ鼭 data���� ���� right���Ҹ� ã�´�.
			// (pivot+1<=right) �� right�� pivot���� �۾����� ���� �����Ѵ�.
			while((array[--right]>data) && (pivot+1<=right)) {}
			
			// right�� left���� ũ�� �ΰ��� ���Ҹ� ��ȯ�Ѵ�.
			if(left<=right) {
				this.swap(left, right);
			}
		}while(left<right);
		
		// ���ذ��� right ������ ���� ��ȯ�Ѵ�.
		this.swap(pivot, right);

		return right;
	}
	
	// �迭���� �ΰ��� ���Ҹ� ��ȯ�ϴ� �Լ��Դϴ�.
	public void swap(int a, int b)
	{
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public boolean add(int data)
	{
		// �迭�� �������� ��Ȳ�� ó���ϴ� ����ó�� ���ǹ��Դϴ�.
		if(size==maxSize) {
			System.out.println("�迭�� ���� á���ϴ�.");
			return false;		// add ����
		}
		else {
			array[i++] = data;	// 0���� ���Ұ����� �����鼭 i�� ������ŵ�ϴ�.
			++size;				// ���� ���� ����
			return true;		// add ����
		}
	}
	
	// �迭���� ù��° ���Ҹ� ����մϴ�.
	public void getFirst()
	{
		i=0;
		System.out.print(array[i++]);	// getNext() �Լ��� ���� i�� 1 ���������ݴϴ�.
	}
	
	// �迭���� �ι�° ���Һ��� ������ ���ұ��� ����մϴ�.
	public void getNext()
	{
		// �ε��� i�� �迭�� �����ϴ� ������ ���ұ��� �ݺ��մϴ�.
		while(i<size) {
			System.out.print(", "+array[i++]);	// ���� ���Ҹ� ���� ����ϰ� i�� ������ŵ�ϴ�.
		}
		System.out.println();
	}
	
	// �迭�� ���� ������ ��ȯ�ϴ� �Լ��Դϴ�.
	public int size()
	{
		return size;
	}
}
