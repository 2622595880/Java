
public class Student {
	private String name;
	private  int age;
	private String education;
	public Student(String name,int age,String education)//���췽��
	{
		this.name=name;
		this.age=age;
		this.education=education;
	}
	public void show()
	{
		System.out.println("����:"+name+"  ����:"+age+" ѧ��:"+education+"");
	}
}
