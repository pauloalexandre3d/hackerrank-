import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Am {

	static int minimumTime(int numOfSubFiles, List<Integer> files) {
		// first of all I need sort files by size
		Integer time = 0;
		while (files.size() > 1) {
			Collections.sort(files);
			time = time + files.get(0) + files.get(1);
			files.add(files.get(0) + files.get(1));
			files.remove(0);
			files.remove(0);
		}
		return time;

	}

	@Test
	public void test() {

		List<Integer> files = new ArrayList<Integer>();
		files.add(20);
		files.add(4);
		files.add(8);
		files.add(2);
		assertEquals(54, minimumTime(4, files));

	}

}
