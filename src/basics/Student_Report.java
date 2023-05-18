package basics;

public class Student_Report {
	

	public static void main(String[] args) {
		
		int english= 78;
		int tamil= english++;
		int maths= english--;
		int science= 90;
		int social= 90;
		
		float total=english+tamil+maths+science+social;
		
		double average=total/5;
				
		System.out.println("The Total is " + total);			
		System.out.println("The Average is " + average);
		
		if (english>=40&&tamil>=40&&maths>=40&&science>=40&&social>=40) {
		System.out.println("Student Passed");
		}
		else {
			System.out.println("Student Failed");
		}
		//If Average is 90 to 100=first class, 80 to 89=second class, 70 to 79=third class, 
		//50 to 69=average, 40 to 49=below average, 39 and less= poor 
		
		if (average>89) {System.out.println("First Class");}
			else if (average>79&&average<90) {System.out.println("Second class");}
			else if (average>69&&average<80) {System.out.println("Third class");}
			else if (average>49&&average<70) {System.out.println("Average class");}
			else if (average>39&&average<50) {System.out.println("Below Average class");}
			else {System.out.println("Poor");}
		
		
}
}