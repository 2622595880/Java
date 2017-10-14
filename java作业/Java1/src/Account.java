
public class Account{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DepositAccount saver=new DepositAccount();
		saver.Open("1234567890", "ZhangSan", 5000);
		saver.Deposit(2000);
		saver.withdrawl(1000);
		saver.changePassword(123456);
		saver.Query();
		saver.cal_Rate();
		
	}
}