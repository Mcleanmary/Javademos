package basics;

public class NestedLoops6 {
public static void main(String[]args) {
	//triangle and inverted
	for (int i=1; i<=5; i++) {
		
		for (int j =1; j<=i;j++ ) {
			System.out.print(j+ "\t");
		}
		System.out.println();
		}
	for (int i=4; i>=1; i--) {
	
		for (int j =1; j<=i; j++) {
			System.out.print(j+ "\t");
		}
		System.out.println();
		}
	}

}

