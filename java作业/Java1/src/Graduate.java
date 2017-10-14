
public class Graduate extends Student {//学生类派生研究生类
	private String direction;
	public Graduate(String name, int age, String education,String direction) 
	{
		super(name, age, education);
		// TODO Auto-generated constructor stub
		setDirection(direction);
	}
	private void setDirection(String direction)
	{
		// TODO Auto-generated method stub
		this.direction=direction;
	}
	public void show()
	{
		super.show();//调用父类的方法
		System.out.println("研究方向是:"+direction);
	}	
}
