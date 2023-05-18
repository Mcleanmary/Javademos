package arrays;

import java.util.Scanner;

public class CreateArray {

	static int size;

	public void elements() {
		int[] data = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter data " + (i + 1));
			Scanner sc = new Scanner(System.in);
			data[i] = sc.nextInt();

		}
		for (int i = 0; i < size; i++) {
			if (data[i]%2==0){
			System.out.print(data[i] + " ");
		}
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		CreateArray a = new CreateArray();
		a.elements();

	}
}
