
public class Graduate extends Student {//ѧ���������о�����
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
		super.show();//���ø���ķ���
		System.out.println("�о�������:"+direction);
	}	
}
