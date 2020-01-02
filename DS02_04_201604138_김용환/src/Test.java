import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public void run(String file)
	{
		int words = 0;	// �ܾ��� ���� ����
		int chars = 0;	// ������ ���� ����
		try {
			BufferedReader in = new BufferedReader(new FileReader(file)); // test ������ �о�ɴϴ�.
			String line = in.readLine();	// test ���Ͽ��� ������ �о�ɴϴ�.
			
			while(line != null)
			{
				myStringTokenizer parser = new myStringTokenizer(line, " ");
				
				// �迭�� �ܾ �����ִµ��� �ܾ��� ���� ������ ���� ������ŵ�ϴ�.
				while(parser.hasMoreTokens())
				{
					++words;
					String word = parser.nextToken();
					chars = chars + word.length();
				}
				line = in.readLine(); // ������ �д°��� ������ ���� ���� �ٽ� �о���Դϴ�.
			}
			in.close();
			
		}catch(IOException e)
		{
			System.out.println(e);
		}
		
		System.out.println("words: " + words);		// �ܾ��� ���� ���
		System.out.println("characters : " + chars);// ������ ���� ���
	}	
}
