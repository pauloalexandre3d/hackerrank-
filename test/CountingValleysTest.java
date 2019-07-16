import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTest {

	static int countingValleys(int n, String s) {
		
		char[] steps = s.toCharArray();
		
		int seaLevel = 0;
		int countValley = 0;
		for (int i = 0; i < steps.length; i++) {
			char step = steps[i];
			
			if (step == 'U') {
				seaLevel++;
				
				if (seaLevel == 0) {
					countValley++;
				}
				
			}else {
				seaLevel--;
			}
		}
		
		return countValley;
	}

	@Test
	public void test() {
		int n = 8;

		String steps = "DDUUUUDDDDUU";
//		String steps = "UDDDUDUU";

		Assert.assertEquals(2, countingValleys(n, steps));
	}

}
