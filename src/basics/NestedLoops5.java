package basics;

public class NestedLoops5 {
public static void main(String[]args) {
	//inverted triangle
	for (int i=5; i>=1; i--) {
		System.out.println();
	
		for (int j =1; j<=i; j++) {
			System.out.print(j+ "\t");
		}
		System.out.println();
		}
	}
	
}

