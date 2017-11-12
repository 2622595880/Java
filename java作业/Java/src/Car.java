
public class Car {
	ComputerWeight[] com=new ComputerWeight[3];
	Car(ComputerWeight[] com)
	{
		this.com=com;
	}
	public void sum()
	{
		double sum;
		sum=com[0].computerWeight()+com[1].computerWeight()+com[2].computerWeight();
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerWeight[] com=new ComputerWeight[3];
		com[0]=new Television(5,20);
		com[1]=new Computer(10,15);
		com[2]=new WashMachine(3,50);
		double sum;
		sum=com[0].computerWeight()+com[1].computerWeight()+com[2].computerWeight();
		System.out.println("货物的总重量为:"+sum);
		
	}

}
