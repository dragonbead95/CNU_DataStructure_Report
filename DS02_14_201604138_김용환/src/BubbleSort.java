
public class BubbleSort {
	public void sort(int[] arr, int size)
	{
		int temp=0;	/* ��ȯ �ӽ� ���� */
		
		/* �迭�� ���Ҹ� 0~size-1���� �ݺ��մϴ�. */
		for(int i=0;i<size-1;i++)
		{
			/* �迭�� ���Ҹ� 0~size-i���� �ݺ��մϴ�. */
			for(int j=1;j<size-i;j++)
			{
				/* ���μ��� ������ ���Ҹ� ���Ͽ� ���������� �����մϴ�.*/
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
