package Hello.world.prgms.practicals1;

//steps to progm
// 1. Requirement gathering
// 2. test cases
// 3. design method header
// 4. psuedo code

public class ControlStatement {

	public static void main(String[] args) {
		System.out.println("Is two numbers palindrome "+palindrome(121));
		System.out.println("Is two numbers palindrome "+palindrome(1234));
		System.out.println("Is two numbers palindrome "+palindrome(35553));
		System.out.println("Is two numbers palindrome "+palindrome(11112));
	}

	public static void isOdd(int i) {
		while (i <= 100) {
			if (i % 2 != 0) {
				System.out.println("odd number = " + i);
			}
			i++;
		}

	}

	public static void isEven(int i) {
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println("even number =" + i);
			}
			i++;
		}
	}
	
	public static void nonMultiplesOf3() {
		for (int i = 3; i <= 100; i++) {
			if (i % 3 != 0) {
				System.out.println("non multiple of 3 =" + i);
			}
		}
	}
	
	public static void isOddIsEven() {
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.println("even num = " + i);
			else
				System.out.println("odd num = " + i);
		}
	}
	
	public static void divisibilityCheckOf3And5() {
		for (int i = 3; i <= 100; i++) {
			if (i % 3 == 0 ^ i % 5 == 0) {
				System.out.println("divisible = " + i);
			}
		}
	}

	public static void division(int a, int b) {
		double r = a % b;
		double q = a / b;
		System.out.println("remainder = " + r);
		System.out.println("quotient = " + q);
	}
	
	public static boolean isPowerOf2(int n) {
		if (n < 2)
			return false;
		while (n % 2 == 0) {
			n = n / 2;
		}
		if (n == 1)
			return true;
		else
			return false;
	}
	public static int differenceBtwDigits(int n)
	{
		if (n % 100 == 0)
			return n / 100;
		int sum1 = 0;

		for (int i = 0; i < n / 2; i += 2) {
			sum1 = sum1 + (n % 10);
			n = n / 10;
		}
		return sum1;
	}

	public static void gcd(int n1, int n2) {
		if (n1 == 0)
			System.out.println("gcd is " + n2);
		if (n2 == 0)
			System.out.println("gcd of" + n1);
		int gcd = 1;
		if (n1 != 0 && n2 != 0) {
			for (int i = 1; i <= n1 && i <= n2; i++) {
				if (n1 % i == 0 && n2 % i == 0)
					gcd = i;
			}
			System.out.println("gcd of " + n1 + " & " + n2 + "= " + gcd);
		}
	}
	
	public static void hcf(int n1, int n2) {
		if (n1 == 0)
			System.out.println("hcf of " + n1 + " & " + n2 + "= " + n2);
		if (n2 == 0)
			System.out.println("hcf of " + n1 + " & " + n2 + "= " + n1);
		int hcf = 0;
		if (n1 != 0 && n2 != 0) {
			for (int i = 1; (i <= n1 || i <= n2); i++) {
				if (n1 % i == 0 && n2 % i == 0)
					hcf = i;
			}
			System.out.println("hcf of " + n1 + " & " + n2 + "= " + hcf);
		}
	}
	
	public static boolean palindrome(int n)
	{
		int temp = n;
		int r = 0;
		while(temp!=0)
		{
			r = (r*10)+(temp%10);
			temp = temp/10;
		}
		if(r == n)
			return true;
		else 
			return false;
	}
	
}
