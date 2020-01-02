
public class BubbleSort {
	public void sort(int[] arr, int size)
	{
		int temp=0;	/* 교환 임시 변수 */
		
		/* 배열의 원소를 0~size-1까지 반복합니다. */
		for(int i=0;i<size-1;i++)
		{
			/* 배열의 원소를 0~size-i까지 반복합니다. */
			for(int j=1;j<size-i;j++)
			{
				/* 서로서로 인접한 원소를 비교하여 오름차순을 설정합니다.*/
				if(arr[j]<arr[j-1])
				{
					 temp = arr[j-1];
					 arr[j-1] = arr[j];
					 arr[j] = temp;
				}
			}
		}
	}
}
