package arrays;

import java.util.Scanner;

public class AscendingOrder {

	static int size;
	int[] data = new int[size];
	int n = 0;

	public void elements() {

		System.out.println("Enter " + size + " elements : ");
		for (int i = 0; i < size; i++) {
			Scanner sc = new Scanner(System.in);
			data[i] = sc.nextInt();
		}
		
	}

	public void ascending() {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (data[i] > data[j]) {
					n = data[i];
					data[i] = data[j];
					data[j] = n;
				}
			}
			
		}
		for (int i = 0; i < size; i++) {
			System.out.print(data[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size: ");
		size = sc.nextInt();
		AscendingOrder as = new AscendingOrder();
		as.elements();
		as.ascending();

	}
}
