package methods;

public class StaticDemo {
	// triangle 1 , 2 3 , 4 5 6, 7 8 9 10

	static int k = 0;

	public static int display() {
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				k = k + 1;
				System.out.print(k + "\t");

			}

			System.out.println();
		}
		return k;
	}

	public static void main(String[] args) {
		display();
	}
}
