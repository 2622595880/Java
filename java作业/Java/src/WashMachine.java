
public class WashMachine implements ComputerWeight {
	int mount;
	double weight;
	WashMachine(int m,double n)
	{
		mount=m;
		weight=n;
	}
	public void setmount(int m)
	{
		mount=m;
	}
	@Override
	public double computerWeight() {
		// TODO Auto-generated method stub
		return mount*weight;
	}

}
