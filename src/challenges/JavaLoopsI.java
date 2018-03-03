package challenges;

import java.util.Scanner;

import org.junit.Test;

public class JavaLoopsI {

	@Test
	public void test() {
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for (int i = 1; i <= 10; i++) {
			System.out.println(String.format("%s x %d = %d", N, i, N*i));
		}
        
	}

}
