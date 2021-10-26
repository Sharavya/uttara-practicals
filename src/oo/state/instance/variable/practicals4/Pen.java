package oo.state.instance.variable.practicals4;

public class Pen {

	int inkQty;
	String colour;
	
	public void write(String data)
	{
		if(inkQty>0)
		{
			System.out.println("writing.."+data);
			inkQty--;
		}
		else
			System.out.println("yakappa.. refill ink");
	}
	public void refill(int qty)
	{
		inkQty = inkQty+qty;
	}
}
