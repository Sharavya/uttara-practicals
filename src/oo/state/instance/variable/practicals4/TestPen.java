package oo.state.instance.variable.practicals4;

public class TestPen {

	public static void main(String[] args)
	{
		Pen p1 = new Pen();
		p1.colour = "Blue";
		System.out.println("inkqty in p1 = "+p1.inkQty);
		p1.refill(2);
		System.out.println("inkqty in p1 = "+p1.inkQty);
		p1.write("today is ambedker jayanthi");
		System.out.println("inkQty in p1 = "+p1.inkQty);
		p1.write("hohohahahahhahooo");
		System.out.println("inkQty in p1 = "+p1.inkQty);
		p1.write("what to write only i dont know...");
		/*Pen p2 = new Pen();
		p2.colour = "red";*/
		
	}
}
