
public class MyTemperature implements Temperature{
	private double celsius;

	public MyTemperature(double value, char scale)
	{
		if(scale == 'C' || scale == 'c')
		{
			setCelsius(value);
		}else if(scale=='F' || scale =='f')
		{
			setFahrenheit(value);
		}else
		{
			System.exit(0);
		}
	}
	
	@Override
	public double getCelsius() {
		// TODO Auto-generated method stub
		return celsius;
	}

	@Override
	public double getFahrenheit() {
		// TODO Auto-generated method stub
		return 9*celsius/5 + 32.0;
	}

	@Override
	public void setCelsius(double celsius) {
		// TODO Auto-generated method stub
		this.celsius = celsius;
	}

	@Override
	public void setFahrenheit(double fahrenheit) {
		// TODO Auto-generated method stub
		this.celsius = 5*(fahrenheit-32)/9;
	}
	
	// 출려 설정
	public String toString()
	{
		return Math.round(getCelsius()) + "C =" + Math.round(getFahrenheit()) + "F";
	}
}
