
public class InsertionSort {
	public void sort(int[] data, int size)
	{
		/* �迭�� ���Ҹ� 1~7���� �ݺ��մϴ�. */
		for(int index=1;index<data.length;index++)
		{
			int temp = data[index];	/* ������ ���Ҹ� �ӽú����� �����մϴ�.*/
			int aux = index-1;		/* ���Ĵ���� ������ �����մϴ�. */
			
			/* ���ʿ� �ִ� ���ҵ��� �� ū�� �˻��մϴ�. */
			while((aux>=0) && (data[aux]>temp))
			{
				data[aux + 1] = data[aux];	/* ��ĭ�� �о ���Ҹ� �����մϴ�.*/
				aux--;						/* ���� ���Ҹ� Ž���մϴ�. */
			}
			data[aux+1] = temp;	/* �� ��ȯ�Ұ� ���� �ڸ��� temp ������ �����մϴ�. */
		}
	}
}
