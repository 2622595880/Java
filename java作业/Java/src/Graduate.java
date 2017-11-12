
public class Graduate implements StudentMange, TeacherManage {
	String name,sex;
	int age;
	double fee,pay;
	public Graduate(String name,String sex,int age,double fee,double pay)
	{
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.fee=fee;
		this.pay=pay;
	}
	@Override
	public void setPay(double pay) {
		// TODO Auto-generated method stub
		this.pay=pay;
	}

	@Override
	public double getPay() {
		// TODO Auto-generated method stub
		return this.pay;
	}

	@Override
	public void setFee(double fee) {
		this.fee=fee;
		// TODO Auto-generated method stub

	}

	@Override
	public double getFee() {
		// TODO Auto-generated method stub
		return this.fee;
	}

}
