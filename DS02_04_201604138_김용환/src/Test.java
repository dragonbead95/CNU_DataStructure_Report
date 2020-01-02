import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public void run(String file)
	{
		int words = 0;	// 단어의 갯수 변수
		int chars = 0;	// 글자의 길이 변수
		try {
			BufferedReader in = new BufferedReader(new FileReader(file)); // test 파일을 읽어옵니다.
			String line = in.readLine();	// test 파일에서 한줄을 읽어옵니다.
			
			while(line != null)
			{
				myStringTokenizer parser = new myStringTokenizer(line, " ");
				
				// 배열에 단어가 남아있는동안 단어의 수와 글자의 수를 누적시킵니다.
				while(parser.hasMoreTokens())
				{
					++words;
					String word = parser.nextToken();
					chars = chars + word.length();
				}
				line = in.readLine(); // 한줄을 읽는것이 끝나면 다음 줄을 다시 읽어들입니다.
			}
			in.close();
			
		}catch(IOException e)
		{
			System.out.println(e);
		}
		
		System.out.println("words: " + words);		// 단어의 갯수 출력
		System.out.println("characters : " + chars);// 글자의 길이 출력
	}	
}
