package basics;

public class Primeornotrange {
public static void main(String[] args) {

	int x=11;
	
  for (int num=1;num<=x;num++) 
 	{
	 int count=0;
 	 for(int i=1;i<=num;i++) 
 	 {
		if(num%i==0) {count++;}
 	 }
	//if(count>2) {System.out.println(num + " is Not Prime");}
		// else {System.out.println(num + " is Prime");}
	
	if(count<=2) {System.out.print(num + "\t");}
	 }
  System.out.print("are all Prime Numbers.");

}
}
