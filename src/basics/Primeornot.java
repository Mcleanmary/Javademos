package basics;

public class Primeornot {
public static void main(String[] args) {

 int num=11;
 int count=0;
 
 if(num<=3) 
 		{ System.out.println("is Prime");  } 
 else 	{
	 
	 
	  for(int i=1;i<=num/2;i++) {
			 if(num%i==0) {count++;}
		 }
		 if(count>1) {System.out.println(num + " is Not Prime");}
		 else {System.out.println(num + " is Prime");}
		 }  
  }

}
