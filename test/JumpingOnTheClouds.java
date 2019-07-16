import static org.junit.Assert.*;

import org.junit.Test;

public class JumpingOnTheClouds {

	static int jumpingOnClouds(int[] c) {

		int countJump = 0;
		for (int i = 0; i < c.length; i++) {

			if ((i + 2 < c.length) && c[i + 2] == 0) {
				countJump++;
				i++;
				continue;
			} else if( (i + 2 <= c.length)) {
				countJump++;
			}
		}

		return countJump;

	}

	@Test
	public void test2() {
		int[] c = { 0, 1, 0, 0, 1, 0 };
		assertEquals(3, jumpingOnClouds(c));
	}

	@Test
	public void test1() {
		int[] c = { 0, 1, 0 };
		assertEquals(1, jumpingOnClouds(c));
	}

	@Test
	public void testFinal1() {
		int[] c = { 0, 0, 1, 0, 0, 1, 0 };
		assertEquals(4, jumpingOnClouds(c));
	}
	
	@Test
	public void testFinal2() {
		int[] c = { 0 ,0 ,0 ,0 ,1 ,0 };
		assertEquals(3, jumpingOnClouds(c));
	}
	
	@Test
	public void testFinal3() {
		int[] c = { 0 ,0 ,0 ,1 ,0 ,0 };
		assertEquals(3, jumpingOnClouds(c));
	}

}
