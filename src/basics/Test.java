package basics;

public class Test {

	public static void print(int i) {
		System.out.println("int");
	}
	public static void print(long i) {
		System.out.println("long");
	}
	public static void print(Integer i) {
		System.out.println("Integer");
	}
	
	public static void main(String[] args) {
	Test.print(10);
	}
}
