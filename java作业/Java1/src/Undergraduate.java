  public class Undergraduate extends Student {//ѧ����������������
	private String specialty;
	public Undergraduate(String name, int age, String education,String specialty)
	{
		super(name, age, education);
		this.specialty=specialty;
	}
	public void show()
	{
		super.show();//���ø���ķ���
		System.out.println("רҵ��:"+specialty);
	}	
}
