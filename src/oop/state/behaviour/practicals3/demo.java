package oop.state.behaviour.practicals3;

public class demo {

	public static void main(String[] args)
	{
		int i = 3;
        i++;
        System.out.println(i);  //4
        ++i; 
        System.out.println(i);  //5
        System.out.println(++i); //6
        System.out.println(i++); //6
        System.out.println(i);  //7
        
		/*int result = +1;
		System.out.println(result); // 1
		result--;
		System.out.println(result); //0
		result++;
		System.out.println(result); //1
		result = -result; 
		System.out.println(result); //-1
		boolean success = false;
		System.out.println(success); // false
		System.out.println(!success); // true
*/
        int result = 1 + 2;
        System.out.println(result); //3
        result = result - 1;
        System.out.println(result); //2
        result = result * 2;
        System.out.println(result); //4
        result = result / 2;
        System.out.println(result); //2
        result = result + 8;
        System.out.println(result); //10
        result = result % 7;
        System.out.println(result); //3        
        System.out.println("result of div 0.0/0 = "+(0.0/0));

        int testscore = 60;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);





	}
}
