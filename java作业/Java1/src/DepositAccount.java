public class DepositAccount {
	static double rate_Year=0.023;
	private String accountNum;
	private String userName;
	private int password;
	private double balance; 
	public void Open(String accountNum,String userName,double balance)//����
	{
		this.accountNum=accountNum;
		this.userName=userName;
		this.balance=balance;
		System.out.println("�˻�Ϊ:"+accountNum+"���û�:"
				 +userName+"�����ɹ�����������:"+balance+"");
	}
	public void Deposit(double m)//���
	{
		balance+=m;
		System.out.println("���û������Ϊ:"+m);
	}
	public boolean withdrawl(float m)//ȡ��
	{
		if(m<=balance)
		{
			balance-=m;
			System.out.println("�ɹ�ȡ��:"+m);
			return true;
		}
		else
		{
			System.out.println("��ȡ����������˻����:");
			return false;
		}
	}
	public double Query()//��ѯ
	{
		System.out.println("���û����Ϊ:"+balance);
		return balance;
	}
	public void cal_Rate()
	{
		double rate=balance*rate_Year;
		System.out.println("���û�������ϢΪ:"+rate+"����ϢΪ:"+(float)rate/12);
	}
	public void  changePassword(int pass)
	{
		password=pass;
		System.out.println("���û��޸�����ɹ�");
	}
}


