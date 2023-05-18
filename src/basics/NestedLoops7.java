package basics;

public class NestedLoops7 {
	public static void main(String[] args) {
		// triangle type2

		for (int i = 1, k = 0; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				k = k + 1;
				System.out.print(k + "\t");

			}

			System.out.println();
		}
	}
}
