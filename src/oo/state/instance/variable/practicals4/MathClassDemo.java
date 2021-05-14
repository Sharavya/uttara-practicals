package oo.state.instance.variable.practicals4;

public class MathClassDemo {

	public static void main(String[] args)
	{
		System.out.println(Math.sqrt(121));
		System.out.println(Math.cbrt(8));
		System.out.println(Math.pow(6,2));
		System.out.println(Math.floor(9.9999));
		System.out.println(Math.ceil(9.009));
		System.out.println(Math.round(9.5));
		System.out.println(Math.round(9.49));
		System.out.println(Math.abs(+9.999));
		System.out.println(Math.abs(-9.999));
		System.out.println(Math.random());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		for(int i =1;i<=100;i++)
		{
			double result = Math.random()*100;
			System.out.println((int)result);
		}
	}
}

