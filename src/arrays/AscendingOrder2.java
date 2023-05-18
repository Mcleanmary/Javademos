package arrays;

import java.util.Scanner;

public class AscendingOrder2 {

	int[] data = new int[] { 23, 34, 65, 25, 22 };
	int n = 0;

	public void ascending() {
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					n = data[i];
					data[i] = data[j];
					data[j] = n;
				}
			}
		}
		System.out.println("The data in ascending order: ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

	public static void main(String[] args) {
		AscendingOrder2 as = new AscendingOrder2();
		as.ascending();
	}
}
