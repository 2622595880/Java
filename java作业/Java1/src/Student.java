
public class Student {
	private String name;
	private  int age;
	private String education;
	public Student(String name,int age,String education)//构造方法
	{
		setName(name);
		setAge(age);
		setEducation(education);
	}
	private void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	private void setAge(int age) {
		// TODO Auto-generated method stub
		this.age=age;
	}
	private void setEducation(String education) {
		// TODO Auto-generated method stub
		this.education=education;
	}
	public void show()
	{
		System.out.println("姓名:"+name+"  年龄:"+age+" 学历:"+education+"");
	}
}
