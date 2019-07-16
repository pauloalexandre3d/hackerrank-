import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SockMerchantTest {

	@Test
	public void test() {

        int n = 9;

        int[] colors = {10, 20, 20, 10, 10, 30, 50, 10, 20};

		Assert.assertEquals(3, sockMerchant(n, colors));
	}

	
	static int sockMerchant(int n, int[] colors) {
		
		Arrays.sort(colors);
		
		int countPair = 0;
		for (int i = 0; i < colors.length;) {
			
			if ((i + 1 < colors.length) && colors[i] == colors[i+1]) {
				countPair++;
				i = i + 2;
				continue;
			}else {
				i++;
			}
		}
		return countPair;
    }
	
}
