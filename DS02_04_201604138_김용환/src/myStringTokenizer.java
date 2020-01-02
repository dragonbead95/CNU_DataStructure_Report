public class myStringTokenizer {
	private String[] words;		// makeWord 메소드로 구분한 단어들의 배열
	private String line = "";	// file의 한줄 을 입력받는 변수
	private String token = "";	// 구분자 변수
	private int index;			// words 배열의 인덱스 변수
	
	
	/**
	 * line 변수는 file에서 한줄 입력받은 문자열을 입력받습니다.
	 * token 변수는 구분자를 입력받습니다.
	 * words 배열은 makeWords 메소드를 이용하여  line 문자열에서 구분자를 기준으로 나눠 배열에 넣습니다.
	 * index 변수는 0으로 초기화해 words 배열의 처음을 가리킵니다.
	 * @param line
	 * @param token
	 */
	public myStringTokenizer(String line, String token)
	{
		this.line = line;
		this.token = token;
		this.words = makeWords(line,token);
		this.index = 0;
	}
	
	/**
	 * line 문자열을 token을 기준으로 나눠 배열을 만드는 메소드입니다.
	 * @param line
	 * @param toekn
	 * @return
	 */
	public String[] makeWords(String line, String toekn)
	{
		String[] tmp = null;	// 결과를 반환할 문자열 배열
		int split_index = 0;	// tmp 배열의 인덱스
		int	split_length = 1;	// line 문자열의 단어 갯수
		int begin_index = 0;	// subString 메소드 시작 인덱스
		int last_index = 0;		// subString 메소드 마지막 인덱스
		
		
		// line 문자열의 단어들을 검사하여 token이 나오면 'tmp'배열의 길이를 늘립니다.
		for(int i=0;i<line.length();i++)
		{
			if(line.substring(i, i+1).equals(token))
			{		
				split_length++;
			}
		}
		
		// line 문자열을 검사하며 나온 단어들의 갯수만큼의 저장공간을 설정합니다.
		tmp = new String[split_length];
		
		// line 문자열을 검사하여 token 구분자가 나오면 tmp 배열에 저장하는 반복문입니다.
		for(int i=0; i<line.length();i++)
		{
			// 마지막 단어이면 마지막 단어를 배열 인덱스 에 삽입한다.
			if(split_length==(split_index+1))
			{
				tmp[split_index] = line.substring(begin_index,line.length());
				break;
			}
			else if(line.substring(i, i+1).equals(token))
			{
				last_index = i;	// subString 메소드의 마지막 인덱스 설정
				
				// token을 제외한 구분자 앞의 단어를 tmp 배열에 저장합니다.
				tmp[split_index] = line.substring(begin_index,last_index);	
				begin_index = i+1;	// 다음 단어를 저장하기 위해 시작 위치를 다시 저장합니다.
				split_index++;		// tmp 배열의 인덱스 저장위치를 한칸 증가시킵니다.
			}
		}
		return tmp;	// line 문자열을 구분자로 나눈 tmp 배열을 반환합니다.
	}
	
	// 토큰이 남아있으면 true, 없으면 false
	public boolean hasMoreTokens()
	{
		// index가 words 배열의 크기보다 작으면 토큰이 있는것으로 간주
		if(index<words.length)
		{
			return true;	// 토큰이 있음
		}else {
			return false;	// 토큰이 없음
		}
	}
	
	// 다음 토큰를 반환합니다.
	public String nextToken()
	{
		return words[index++];
	}
}
