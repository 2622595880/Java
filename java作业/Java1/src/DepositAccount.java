public class DepositAccount {
	static double rate_Year=0.023;
	private String accountNum;
	private String userName;
	private int password;
	private double balance; 
	public void Open(String accountNum,String userName,double balance)//开户
	{
		this.accountNum=accountNum;
		this.userName=userName;
		this.balance=balance;
		System.out.println("账户为:"+accountNum+"的用户:"
				 +userName+"开户成功，并存入金额:"+balance+"");
	}
	public void Deposit(double m)//存款
	{
		balance+=m;
		System.out.println("该用户存款金额为:"+m);
	}
	public boolean withdrawl(float m)//取款
	{
		if(m<=balance)
		{
			balance-=m;
			System.out.println("成功取款:"+m);
			return true;
		}
		else
		{
			System.out.println("所取金额数大于账户余额:");
			return false;
		}
	}
	public double Query()//查询
	{
		System.out.println("该用户余额为:"+balance);
		return balance;
	}
	public void cal_Rate()
	{
		double rate=balance*rate_Year;
		System.out.println("该用户的年利息为:"+rate+"月利息为:"+(float)rate/12);
	}
	public void  changePassword(int pass)
	{
		password=pass;
		System.out.println("该用户修改密码成功");
	}
}


