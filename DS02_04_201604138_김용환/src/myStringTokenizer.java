public class myStringTokenizer {
	private String[] words;		// makeWord �޼ҵ�� ������ �ܾ���� �迭
	private String line = "";	// file�� ���� �� �Է¹޴� ����
	private String token = "";	// ������ ����
	private int index;			// words �迭�� �ε��� ����
	
	
	/**
	 * line ������ file���� ���� �Է¹��� ���ڿ��� �Է¹޽��ϴ�.
	 * token ������ �����ڸ� �Է¹޽��ϴ�.
	 * words �迭�� makeWords �޼ҵ带 �̿��Ͽ�  line ���ڿ����� �����ڸ� �������� ���� �迭�� �ֽ��ϴ�.
	 * index ������ 0���� �ʱ�ȭ�� words �迭�� ó���� ����ŵ�ϴ�.
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
	 * line ���ڿ��� token�� �������� ���� �迭�� ����� �޼ҵ��Դϴ�.
	 * @param line
	 * @param toekn
	 * @return
	 */
	public String[] makeWords(String line, String toekn)
	{
		String[] tmp = null;	// ����� ��ȯ�� ���ڿ� �迭
		int split_index = 0;	// tmp �迭�� �ε���
		int	split_length = 1;	// line ���ڿ��� �ܾ� ����
		int begin_index = 0;	// subString �޼ҵ� ���� �ε���
		int last_index = 0;		// subString �޼ҵ� ������ �ε���
		
		
		// line ���ڿ��� �ܾ���� �˻��Ͽ� token�� ������ 'tmp'�迭�� ���̸� �ø��ϴ�.
		for(int i=0;i<line.length();i++)
		{
			if(line.substring(i, i+1).equals(token))
			{		
				split_length++;
			}
		}
		
		// line ���ڿ��� �˻��ϸ� ���� �ܾ���� ������ŭ�� ��������� �����մϴ�.
		tmp = new String[split_length];
		
		// line ���ڿ��� �˻��Ͽ� token �����ڰ� ������ tmp �迭�� �����ϴ� �ݺ����Դϴ�.
		for(int i=0; i<line.length();i++)
		{
			// ������ �ܾ��̸� ������ �ܾ �迭 �ε��� �� �����Ѵ�.
			if(split_length==(split_index+1))
			{
				tmp[split_index] = line.substring(begin_index,line.length());
				break;
			}
			else if(line.substring(i, i+1).equals(token))
			{
				last_index = i;	// subString �޼ҵ��� ������ �ε��� ����
				
				// token�� ������ ������ ���� �ܾ tmp �迭�� �����մϴ�.
				tmp[split_index] = line.substring(begin_index,last_index);	
				begin_index = i+1;	// ���� �ܾ �����ϱ� ���� ���� ��ġ�� �ٽ� �����մϴ�.
				split_index++;		// tmp �迭�� �ε��� ������ġ�� ��ĭ ������ŵ�ϴ�.
			}
		}
		return tmp;	// line ���ڿ��� �����ڷ� ���� tmp �迭�� ��ȯ�մϴ�.
	}
	
	// ��ū�� ���������� true, ������ false
	public boolean hasMoreTokens()
	{
		// index�� words �迭�� ũ�⺸�� ������ ��ū�� �ִ°����� ����
		if(index<words.length)
		{
			return true;	// ��ū�� ����
		}else {
			return false;	// ��ū�� ����
		}
	}
	
	// ���� ��ū�� ��ȯ�մϴ�.
	public String nextToken()
	{
		return words[index++];
	}
}
