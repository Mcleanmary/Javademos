package Collections;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public void voting() {
		List<Integer> age = new ArrayList();
		age.add(23);
		age.add(12);
		age.add(40);
		age.add(37);
		age.add(10);

		for (int i = 0; i < age.size(); i++) {
			if (age.get(i) >= 18) {
				System.out.println(age.get(i) + " is egilible ");
			} else {
				System.out.println(age.get(i) + " is not egilible ");

			}

		}

	}

	public static void main(String[] args) {

		Demo d = new Demo();
		d.voting();
	}
}
