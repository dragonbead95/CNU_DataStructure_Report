/************************************************
 * ���� : �µ� ��ȯ��
 * �ۼ��� : 2018-03-13
 * �ۼ��� : ���ȯ
 * ���� : F = 9C/5+32
 * 		C = 5(F-32)/9
 ************************************************/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature t = new MyTemperature(20, 'C');
		System.out.println(t);
		
		Temperature t1 = new MyTemperature(69, 'F');
		System.out.println(t1);
	}
}
