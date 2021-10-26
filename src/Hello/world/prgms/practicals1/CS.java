package Hello.world.prgms.practicals1;

public class CS {

	public static void main(String[] args)
	{
		
	
	}
	
	public static int process(int i)
	{
		System.out.println(i);
		i = 20;
		return i;
	}
	
	/*public static boolean isEven(int i)
	{
		if(i<0)
			i = -i;
		if(i>=2 & i%2==0)
			return true;
		else
			return false;
	}*/
	public static boolean isEven(int i)
	{
		if(i<0)
			i = -i;
		return ((i&1)==0);
	}
	
	public static int numberOfDays(int m,double y)
	{
		
		if(y%4==0 & m==2)
		{
			 return 29;
		}
		else if(m==2)
		{
			return 28;
		}
		else if(m==1 || m==3 || m==5||m==7||m==8||m==10||m==12)
			return 31;
		else
			return 30;
	}
	
	public static boolean isPrime(int n)
	{
		if(n==0| n==1)
			return false;
		for(int i=3;i<=(n/2);i+=2)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static boolean isSumEven(int n) {
		int sum = 0;
		if (n < 0)
			n = -n;
		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		if (sum % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static String binary(int n)
	{
		String bin="";
		if(n==0)
			return "0";
		if(n==1)
			return "0001";
		while(n>=1)
		{
			int r = n%2;
			n = n/2;
			bin = bin+r;
		}
		StringBuilder sb = new StringBuilder(bin);
		sb.reverse();
		return sb.toString();
	}
	public static int bitsSetToOne(int n)
	{
		int count = 0;
		if(n==0)
			return 0;
		if(n==1 || n==2)
			return 1;
		while(n>=1)
		{
			int r = n%2;
			n = n/2;
			if(r==1)
				count++;
		}
		return count;
	}
	
	
}
