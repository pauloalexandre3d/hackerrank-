import static org.junit.Assert.*;

import org.junit.Test;

public class RunBinarySearchIteratively {

	@Test
	public void test() {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int left = 0;
		int right = array.length - 1;
		int key = 3;
		assertEquals(2, binarySearchIteratively(array, left, right, key));
	}

	private int binarySearchIteratively(int[] array, int left, int right, int key) {
		int middle = (left + right) / 2;

		if (right < left) {
			return -1;
		}

		if (array[middle] == key) {
			return middle;
		} else if (key < array[middle]) {
			return binarySearchIteratively(array, left, middle - 1, key);
//				right = mid - 1;
		} else {
			return binarySearchIteratively(array, middle + 1, right, key);
//			left = mid + 1;
		}

	}

}
