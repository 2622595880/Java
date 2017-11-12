
public class Student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graduate gr=new Graduate("zhangsan","ÄÐ",23,7000,8000);
		judgeLoan(gr);
	}

	public static void judgeLoan(Graduate gr) {
		// TODO Auto-generated method stub
		if(gr.getPay()-gr.getFee()<2000)
		{
			System.out.println("provide a loan!");
		}
		else
			System.out.println("don't provide a loan");
	}

}
