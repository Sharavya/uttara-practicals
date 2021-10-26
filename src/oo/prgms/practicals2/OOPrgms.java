package oo.prgms.practicals2;

import java.util.Arrays;

public class OOPrgms {
	
	public static void main(String[] args)
	{
		System.out.println( -2 >> 1);
		System.out.println(2 >> 1);
	}
	
	public static void multiplication(int n1, int n2) {
		if (n1 > n2) {
			for (int i = 1; i <= n1; i++)
				System.out.println(n2 + "*" + i + " =" + (n2 * i));
		} else {
			for (int i = 1; i <= n2; i++)
				System.out.println(n1 + "*" + i + " =" + (n1 * i));
		}
	}
	
	public static boolean isEven(int n) {
		if (n == 0 || n == 1)
			return false;
		if (n < 0)
			n = -n;
		if ((n & 1) == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int n) {
		if (n == 0 || n == 1)
			return false;
		if (n < 0)
			n = -n;
		for (int i = 3; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isPerfectSquare(int n)
	{
		if(n==0)
			return true;
		if(n==1)
			return true;
		if(n<0)
			return false;
		for(int i=2;i<n/2;i++)
		{
			if(i*i == n)
				return true;
		}
		return false;
	}
	
	public static boolean isPowerOf2(int n)
	{
		while (n % 2 == 0 && n > 1) {
			n = n / 2;
		}
		if (n == 1)
			return true;
		else
			return false;
	}
	
	public static int onesBits(int n)
	{
		int count = 0;
		if(n==0)
			return 0;
		while(n>=1)
		{
			int r = n%2;
			n= n/2;
			if(r==1)
				count++;
		}
		return count;
	}
	
	public static void fibonacci(int n)
	{
		int n1 = 0,n2=1;
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<n;i++)
		{
			int n3= n1+n2;
			System.out.print(n3+" ");
				n1 = n2;
				n2 = n3;
				if(n3==n)
					return;
		}
	}
	
	public static void gcd(int n1, int n2) {
		if (n1 <= 0 || n1 == 1 || n2 <= 0 || n2 == 1)
			System.out.println("Inavlid inputs");
		else {
			int gcd = 1;
			for (int i = 1; i <= n1 && i <= n2; ++i) {
				if (n1 % i == 0 && n2 % i == 0)
					gcd = i;
			}
			System.out.println("gcd of " + n1 + " & " + n2 + "= " + gcd);
		}
	}
	
	public static void lcm(int n1, int n2) {
		int lcm = (n1 > n2) ? n1 : n2;
		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				System.out.println("lcm of " + n1 + " " + n2 + " = " + lcm);
				break;
			}
			++lcm;
		}
	}
	
	public static boolean palindrome(int n)
	{
		int temp = n;
		int rev = 0;
		while(temp!=0)
		{
			rev = (rev*10)+(temp%10);
			temp = temp/10;
		}
		if(rev == n)
			return true;
		else
			return false;
	}
	
	public static int sumOfDigits(int n) {
		if (n >= 0 && n <= 10)
			return n;
		int r = 0;
		while (n != 0) {
			r = (n % 10) + r;
			n /= 10;
		}
		return r;
	}
	public static void binHex(int n)
	{
		System.out.println("binary reprentation of num -"+Integer.toBinaryString(n));
		System.out.println("hex reprentation of num -"+Integer.toHexString(n));
		System.out.println("octal reprentation of num -"+Integer.toOctalString(n));
		
		System.out.println("base 10 for binary num -"+Integer.toString(n, 2));
		System.out.println("base 10 for ocatl num -"+Integer.toString(n, 8));
		System.out.println("base 10 for Hexa num -"+Integer.toString(n, 16));
	}
	
	public static void factorial(int n) {
		if (n < 0)
			System.out.println("negative inputs are invalid");
		else {
			int f = 1;
			for (int i = 1; i <= n; i++) {
				f = f * i;
			}
			System.out.println("factorial of number " + n + " = " + f);
		}
	}
	
	public static void swapping(int n1,int n2)
	{
		System.out.println("after swapping "+"n1="+n1+" n2= "+n2);
		n1 = n1+n2;
		n2 = n1-n2;
		n1 = n1-n2;
		System.out.println("after swapping "+"n1="+n1+" n2= "+n2);
	}
	
	public static boolean armstrongNumber(int n) {
		int temp = n;
		String s = n + "";
		int numOfDigits = s.length();
		int sum = 0;
		while (temp != 0) {
			int lastDigit = temp % 10;
			sum = sum + (int) Math.pow(lastDigit, numOfDigits);
			temp = temp / 10;
		}
		if (sum == n)
			return true;
		else
			return false;
	}
	
	public static void equalDigits(int n1, int n2)
	{
		String temp1 = String.valueOf(n1);
		String temp2 = String.valueOf(n2);
		int count = 0;
		
		int[] arr1 = new int[temp1.length()];
		int[] arr2 = new int[temp2.length()];
		
		while(n1>0 && n2>0)
		{
			int digit1 = n1%10;
			int digit2 = n2%10;
			arr1[count] = digit1;
			arr2[count] = digit2;
			n1 = n1/10;
			n2 = n2/10;
			count++;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2))
		System.out.println("same digits");
		else
			System.out.println("not same digits");
	}
	
	public static int countOccurences(int n1,int n2)
	{
		int count = 0;
		while(n1>0)
		{
			int lastDigit = n1%10;
			if(lastDigit == n2)
				count++;
			n1 = n1/10;
		}
		return count;
	}
	
	public static boolean increasingOrderDig(int n)
	{
		int lastSeen = 10;
		int current;
		while(n>0)
		{
			current = n%10;
			if(lastSeen<current)
				return false;
			lastSeen = current;
			n = n/10;
		}
		return true;
	}

}
