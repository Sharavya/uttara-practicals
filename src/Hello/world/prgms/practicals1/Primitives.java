package Hello.world.prgms.practicals1;

public class Primitives{
	
	public static void main(String[] args)
	{
		byte b=(byte)128; // explicit casting or down casting leads to data loss
		System.out.println("b = "+b);
		byte b1 = 100;
		int i = b1;
		b = (byte)i;
		System.out.println("b = "+b);
	}
	
}
 
