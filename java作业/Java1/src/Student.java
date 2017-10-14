
public class Student {
	private String name;
	private  int age;
	private String education;
	public Student(String name,int age,String education)//构造方法
	{
		this.name=name;
		this.age=age;
		this.education=education;
	}
	public void show()
	{
		System.out.println("姓名:"+name+"  年龄:"+age+" 学历:"+education+"");
	}
}
