package oop.state.behaviour.practicals3;

public class SwitchDemo {

	public static void main(String[] args)
	{
		int year = 2004;
		int month = 2;
		int numOfDays = 0;
		
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: numOfDays=31;
		break;
		case 4: case 6: case 9: case 11: numOfDays = 30;
		break;
		case 2: if(((year%4==0) && !(year%100==0)) ||(year%400==0))
			numOfDays = 29;
		else
			numOfDays = 28;
		break;
		default: System.out.println("invalid month");
		break;
		}
		System.out.println("number of days in month "+month+" = "+numOfDays);
	}
	
}
