  public class Undergraduate extends Student {//学生类派生本科生类
	private String specialty;
	public Undergraduate(String name, int age, String education,String specialty)
	{
		super(name, age, education);
		setSpecialty(specialty);
		// TODO Auto-generated constructor stub
	}
	private void setSpecialty(String specialty)
	{
		// TODO Auto-generated method stub
		this.specialty=specialty;
	}
	public void show()
	{
		super.show();//调用父类的方法
		System.out.println("专业是:"+specialty);
	}	
}
