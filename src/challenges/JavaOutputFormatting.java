package challenges;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("================================");

		for (int i = 0; i < 3; i++) {

			String word = scan.next();
			int number = scan.nextInt();

//			System.out.printf("%-15s%03d%n", s1, x);
			System.out.println(String.format("%-15s%03d", word, number));

		}
		System.out.println("================================");
		

	}

}
