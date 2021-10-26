package oop.state.behaviour.practicals3;

public	class TestDuck
	{
		public static void main(String[] args)
		{
			Duck d1 = new Duck(); // create Duck ref, point to Duck obj
			d1.size = 5;
			d1.name = "Janu";
			d1.dance(); // janu- cha cha
			
			Duck d2 = new Duck();
			d2.size = 15;
			d2.name = "Panu";
			d2.dance(); // panu- bharatnatya
			
			Duck d3 = new Duck();
			d3.size = -5; 
			d3.name = null;
			d3.dance(); // should the Duck dance here? Why is it still working?
			
		}
		
	}


