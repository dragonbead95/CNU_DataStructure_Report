
public class InsertionSort {
	public void sort(int[] data, int size)
	{
		/* 배열의 원소를 1~7까지 반복합니다. */
		for(int index=1;index<data.length;index++)
		{
			int temp = data[index];	/* 정렬할 원소를 임시변수에 저장합니다.*/
			int aux = index-1;		/* 정렬대상인 변수를 설정합니다. */
			
			/* 앞쪽에 있는 원소들이 더 큰지 검사합니다. */
			while((aux>=0) && (data[aux]>temp))
			{
				data[aux + 1] = data[aux];	/* 한칸씩 밀어서 원소를 설정합니다.*/
				aux--;						/* 다음 원소를 탐색합니다. */
			}
			data[aux+1] = temp;	/* 더 교환할게 없는 자리에 temp 변수를 저장합니다. */
		}
	}
}
