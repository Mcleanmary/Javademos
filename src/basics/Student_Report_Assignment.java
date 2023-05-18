package basics;
public class Student_Report_Assignment {
public static void main(String[] args) {
		
		int english= 40;
		int tamil= 43;
		int maths= 45;
		int science= 50;
		int social= 39;
	
		float total=english+tamil+maths+science+social;
		double average=total/5;
				
		System.out.println("The Total is " + total);			
		System.out.println("The Average is " + average);
		
		if (english>=40&&tamil>=40&&maths>=40&&science>=40&&social>=40) 
				{System.out.println("Student Passed");}
		else 	{System.out.println("Student Failed");}
		
		//If Average is 90 to 100=first class, 80 to 89=second class, 70 to 79=third class, 
		//50 to 69=average, 40 to 49=below average, 39 and less= poor 
		
		if (average>=90) {System.out.println("First Class");}
			else if (average>=80&&average<=89) {System.out.println("Second class");}
			else if (average>=70&&average<=79) {System.out.println("Third class");}
			else if (average>=50&&average<=69) {System.out.println("Average class");}
			else if (average>=40&&average<=49) {System.out.println("Below Average class");}
			else {System.out.println("Poor");}
				
}
}