
public class HeapSort {
	int[] newData;	/* 정렬할 배열*/
	
	public void sort(int[] a, int size)
	{
		/* 0번 자리를 비우게 하기 위해서 1을 더크게 선언합니다. */
		this.newData = new int[size+1];
		
		/* 인덱스 1번부터 삽입하기 위해서 0번자리에 0을 삽입합니다. */
		this.newData[0] = 0;	
		
		/* 정렬할 배열에 원래 배열을 복사한다. */
		for(int i=0;i<size;i++)
		{
			this.newData[i+1] = a[i]; 
		}
		
		/* 반복문 변수*/
		int i;
		
		/* 제일 마지막 원소부터 첫번째 원소까지 반복합니다.*/
		for(int j=size; j>0; j--)
		{
			/* 내부노드들을 검사하며 최대 힙을 유지합니다. */
			for(i=size/2;i>0;i--)
			{
				/* 매개 변수로 부모 인덱스와 제일 마지막 인덱스를 삽입합니다. */
				adjust(this.newData,i,j);
			}
			/* 제일 위에있는 원소와 제일 마지막 원소를 자리를 교환합니다. */
			swap(1,j);
		}
		
		/* 정렬된 newData 배열을 a 배열에 삽입합니다. */
		for(int j=0;j<size; j++)
		{
			a[j] = this.newData[j+1];
		}
	}
	
	/* heapify를 실행하여 최대 힙을 유지하는지 검사하고 교환하는 메소드입니다.*/
	public void adjust(int[] newData, int root, int n)
	{
		int child,rootkey;			/* 자식인덱스, 부모값 */
		int temp = newData[root];	/* 부모값 임시변수 */
		rootkey = newData[root];	/* 부모값 */
		child = 2*root;				/* 자식인덱스 값*/
		
		while(child<=n){	/* 자식인덱스가 사이즈를 벗어나지 않는동안 반복 */ 
			if(child==n) {	/* 자식이 왼쪽에만 있는 경우 */
				if(rootkey>newData[child])	/* 이미 최대힙이 이루어진 경우*/
				{
					break;
				}
				newData[root] = newData[child];	/* 최대힙이 이루어지지 않는 경우 부모값 설정 */
				child = child*2;				/* 다음 자식 인덱스로 이동 */
			}else {	/* 자식이 둘다 있는 경우 */				
				/*오른쪽 자식이 사이즈를 벗어나지 않고 오른쪽 자식이 더 큰 경우*/
				if(child+1<n && newData[child]<newData[child+1])
					child++;	/* child 인덱스를 오른쪽 자식으로 설정 */
				if(newData[child]<=newData[root])	/* 부모값이 더 큰 경우 반복문 탈출*/
					break;
				newData[root] = newData[child];		/* 부모값 설정 */
				child = child*2;				/* 다음 자식 인덱스로 이동 */
			}
		}
		newData[child/2] = temp;					/* 부모값 설정 */
	}
	
	/* 배열에서 둘의 자리를 교환하는 함수입니다. */
	public void swap(int i,int j)
	{
		int temp = this.newData[i];
		this.newData[i] = this.newData[j];
		this.newData[j] = temp;
	}
}
