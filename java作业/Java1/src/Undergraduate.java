  public class Undergraduate extends Student {//ѧ����������������
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
		super.show();//���ø���ķ���
		System.out.println("רҵ��:"+specialty);
	}	
}
