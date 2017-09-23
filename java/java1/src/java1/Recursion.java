
public class Recursion
{
	public static void recur(int n)
	{
		System.out.println(n);
		if(n<=5000)
		{
			n*=2;
			recur(n);
			n/=2;
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       recur(1237);
	}

}
