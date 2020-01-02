
public class QuickSort {
	
	public void sort(int[] elements, int size)
	{
		if(size>1)
		{
			int maxLoc = 0;
			/* elements �迭���� �ִ밪�� �ε����� ã�� �ݺ����Դϴ�.*/
			for(int i=1;i<size;i++)
			{
				/* �ִ밪�� �ε����� ã�� maxLoc ������ �ֽ��ϴ�. */
				if(elements[i]>elements[maxLoc])
				{
					maxLoc = i;
				}
			}
			/* �ִ밪�� ���� ������ �����ϴ�.*/
			swap(elements,maxLoc,size-1);
			
			/* �������� ����� �����մϴ�.*/
			quickSortRecursively(elements,0,size-2);
		}
	}
	
	/* �������� ����� �����ϴ� �޼ҵ��Դϴ�. */
	public void quickSortRecursively(int[] elements, int left,int right)
	{
		int pivot = 0, up = 0, down = 0;
		
		/* ������ ������ ���� ������ �����մϴ�. */
		if(left<right)
		{
				pivot = left;	/* ���ذ� ���� */
				up = left;		/* ���ʰ� ���� */
				down = right+1; /* �����ʰ� ���� */
			
			
			/* up�� down���� ������ ���� �ݺ� �����մϴ�.*/
			do {
				/* elements[pivot]������ ū ���� ã���ϴ�.*/
				do {
					up++;
				}while(elements[pivot]>elements[up]);
				
				/* elements[pivot]������ ���� ���� ã���ϴ�.*/
				do {
					down--;
				}while(elements[pivot]<elements[down]);
				
				/* up�� down ��ġ�� ã�Ҵµ� up�� down���� ������ ���� ��ȯ�մϴ�.*/
				if(up<down)
				{
					swap(elements,up,down);
				}
			}while(up<down);
			
			/* up�� down���� ũ�� ���ذ��� down ��ġ���� ��ȯ�մϴ�.*/
			swap(elements,pivot,down);
			
			int mid = down;	// mid ������ �� �ڸ��� ã�� �����Դϴ�.*/
			
			/* mid�� �������� �������� ����� �����մϴ�. */
			quickSortRecursively(elements, left, mid-1);
			quickSortRecursively(elements, mid+1, right);
		}
	}
	
	/* �迭�� left�� right�� ��ȯ�մϴ�. */
	public void swap(int[] elements, int left, int right)
	{
		int temp = elements[left];
		elements[left] = elements[right];
		elements[right] = temp;
	}
}
