import java.util.Scanner;

public class Ex2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		int result = num1+num2;

		System.out.printf("Soma=%d\n", result);

		input.close();
	}
}
