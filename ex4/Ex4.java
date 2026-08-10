import java.util.Scanner;

public class Ex4 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			int a = input.nextInt();
			int b = input.nextInt();
		
			String str = "";

			for (int i = a; i <= b; i++) {
				str += i;
			}
		
			System.out.print(str);

			int n = str.length();
			
			for (int i = 0; i < n; i++) {
				System.out.print(str.charAt(n-i-1));
			}

			System.out.println();
		}
		input.close();
	}
}
