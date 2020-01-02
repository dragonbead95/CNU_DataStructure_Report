
public class HeapSort {
	int[] newData;	/* ������ �迭*/
	
	public void sort(int[] a, int size)
	{
		/* 0�� �ڸ��� ���� �ϱ� ���ؼ� 1�� ��ũ�� �����մϴ�. */
		this.newData = new int[size+1];
		
		/* �ε��� 1������ �����ϱ� ���ؼ� 0���ڸ��� 0�� �����մϴ�. */
		this.newData[0] = 0;	
		
		/* ������ �迭�� ���� �迭�� �����Ѵ�. */
		for(int i=0;i<size;i++)
		{
			this.newData[i+1] = a[i]; 
		}
		
		/* �ݺ��� ����*/
		int i;
		
		/* ���� ������ ���Һ��� ù��° ���ұ��� �ݺ��մϴ�.*/
		for(int j=size; j>0; j--)
		{
			/* ���γ����� �˻��ϸ� �ִ� ���� �����մϴ�. */
			for(i=size/2;i>0;i--)
			{
				/* �Ű� ������ �θ� �ε����� ���� ������ �ε����� �����մϴ�. */
				adjust(this.newData,i,j);
			}
			/* ���� �����ִ� ���ҿ� ���� ������ ���Ҹ� �ڸ��� ��ȯ�մϴ�. */
			swap(1,j);
		}
		
		/* ���ĵ� newData �迭�� a �迭�� �����մϴ�. */
		for(int j=0;j<size; j++)
		{
			a[j] = this.newData[j+1];
		}
	}
	
	/* heapify�� �����Ͽ� �ִ� ���� �����ϴ��� �˻��ϰ� ��ȯ�ϴ� �޼ҵ��Դϴ�.*/
	public void adjust(int[] newData, int root, int n)
	{
		int child,rootkey;			/* �ڽ��ε���, �θ� */
		int temp = newData[root];	/* �θ� �ӽú��� */
		rootkey = newData[root];	/* �θ� */
		child = 2*root;				/* �ڽ��ε��� ��*/
		
		while(child<=n){	/* �ڽ��ε����� ����� ����� �ʴµ��� �ݺ� */ 
			if(child==n) {	/* �ڽ��� ���ʿ��� �ִ� ��� */
				if(rootkey>newData[child])	/* �̹� �ִ����� �̷���� ���*/
				{
					break;
				}
				newData[root] = newData[child];	/* �ִ����� �̷������ �ʴ� ��� �θ� ���� */
				child = child*2;				/* ���� �ڽ� �ε����� �̵� */
			}else {	/* �ڽ��� �Ѵ� �ִ� ��� */				
				/*������ �ڽ��� ����� ����� �ʰ� ������ �ڽ��� �� ū ���*/
				if(child+1<n && newData[child]<newData[child+1])
					child++;	/* child �ε����� ������ �ڽ����� ���� */
				if(newData[child]<=newData[root])	/* �θ��� �� ū ��� �ݺ��� Ż��*/
					break;
				newData[root] = newData[child];		/* �θ� ���� */
				child = child*2;				/* ���� �ڽ� �ε����� �̵� */
			}
		}
		newData[child/2] = temp;					/* �θ� ���� */
	}
	
	/* �迭���� ���� �ڸ��� ��ȯ�ϴ� �Լ��Դϴ�. */
	public void swap(int i,int j)
	{
		int temp = this.newData[i];
		this.newData[i] = this.newData[j];
		this.newData[j] = temp;
	}
}
