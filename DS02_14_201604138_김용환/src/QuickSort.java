
public class QuickSort {
	
	public void sort(int[] elements, int size)
	{
		if(size>1)
		{
			int maxLoc = 0;
			/* elements 배열에서 최대값의 인덱스을 찾는 반복문입니다.*/
			for(int i=1;i<size;i++)
			{
				/* 최대값의 인덱스를 찾아 maxLoc 변수에 넣습니다. */
				if(elements[i]>elements[maxLoc])
				{
					maxLoc = i;
				}
			}
			/* 최대값을 제일 끝으로 보냅니다.*/
			swap(elements,maxLoc,size-1);
			
			/* 분할정복 방식을 수행합니다.*/
			quickSortRecursively(elements,0,size-2);
		}
	}
	
	/* 분할정복 방식을 수행하는 메소드입니다. */
	public void quickSortRecursively(int[] elements, int left,int right)
	{
		int pivot = 0, up = 0, down = 0;
		
		/* 왼쪽이 오른쪽 보다 작을때 실행합니다. */
		if(left<right)
		{
				pivot = left;	/* 기준값 설정 */
				up = left;		/* 왼쪽값 설정 */
				down = right+1; /* 오른쪽값 설정 */
			
			
			/* up이 down보다 작을때 동안 반복 수행합니다.*/
			do {
				/* elements[pivot]값보다 큰 값을 찾습니다.*/
				do {
					up++;
				}while(elements[pivot]>elements[up]);
				
				/* elements[pivot]값보다 작은 값을 찾습니다.*/
				do {
					down--;
				}while(elements[pivot]<elements[down]);
				
				/* up과 down 위치를 찾았는데 up이 down보다 작으면 둘을 교환합니다.*/
				if(up<down)
				{
					swap(elements,up,down);
				}
			}while(up<down);
			
			/* up이 down보다 크면 기준값과 down 위치값을 교환합니다.*/
			swap(elements,pivot,down);
			
			int mid = down;	// mid 변수는 제 자리를 찾은 변수입니다.*/
			
			/* mid를 기준으로 분할정복 방식을 수행합니다. */
			quickSortRecursively(elements, left, mid-1);
			quickSortRecursively(elements, mid+1, right);
		}
	}
	
	/* 배열에 left와 right를 교환합니다. */
	public void swap(int[] elements, int left, int right)
	{
		int temp = elements[left];
		elements[left] = elements[right];
		elements[right] = temp;
	}
}
