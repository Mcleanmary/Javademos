package strings;

public class PrintConsonants {
	public static void main(String[] args) {

		String name = "mary karthik";

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			
				}
			else {
			StringBuffer ss=new StringBuffer(c);
			System.out.print(c);
		}
}
} }