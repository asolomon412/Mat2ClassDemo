
public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 20; i <= 100; i++) {
			if (i % 20 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 4 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
