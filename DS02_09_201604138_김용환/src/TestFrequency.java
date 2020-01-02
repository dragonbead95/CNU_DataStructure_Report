import java.util.*;

public class TestFrequency {
	String[] countries = {"KO","DE","ES","FR","DE","ES","DE"};	//���ڿ� �迭 �ʱ�ȭ
	List list = Arrays.asList(countries);	//countries �迭�� ����Ʈ ���·� ����
	
	public void run()
	{
		// ����Ʈ�� �ش��ϴ� �����̸��� � ���ԵǾ� �ִ��� ����Ѵ�.
		System.out.println("frequency(list,\"DE\"): " + frequency(list, "DE"));
		System.out.println("frequency(list,\"KO\"): " + frequency(list, "KO"));
		System.out.println("frequency(list,\"ES\"): " + frequency(list, "ES"));
		System.out.println("frequency(list,\"FR\"): " + frequency(list, "FR"));
	}
	
	// ����Ʈ�ȿ� �ش�object�� ������ ��ȯ�Ѵ�.
	public int frequency(List list,Object object)
	{
		Iterator itr = list.iterator();	// Iterator ������ ����
		int count=0;					// �ش� ���� ����
		
		// list�� Iterator�� ��ȸ�ϸ� �����͸� ���Ѵ�.
		while(itr.hasNext())
		{
			if(itr.next().equals(object))	// next() �޼ҵ�� ��ȯ�� ����� object�� ���Ѵ�.
				count++;					// ��ġ�ϸ� count ���� ������Ų��.
		}
		return count;					// ī��Ʈ �� ��ȯ
	}
}
