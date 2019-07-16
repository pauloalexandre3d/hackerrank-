import static org.junit.Assert.*;

import org.junit.Test;

public class LeftRotationTest {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {

		int endA = a.length;
		int[] result = new int[endA];
		int startA = d;
		int iresult = 0;

		for (; startA <= endA;) {

			if (startA == a.length) {
				startA = 0;
				endA = d -1;
			}else {
				result[iresult] = a[startA];
				startA++;
				iresult++;
			}
		}
		return result;
	}

	@Test
	public void test1() throws Exception {
		assertEquals(2, rotLeft(new int[] { 1, 2, 3, 4, 5 }, 1)[0]);
	}

	@Test
	public void test() {
		assertArrayEquals(new int[] { 2, 3, 4, 5, 1 }, rotLeft(new int[] { 1, 2, 3, 4, 5 }, 1));
	}

}
