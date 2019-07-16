import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.junit.Test;

public class Abobora {

	@Test
	public void test() {
		String[] animals = { "cat", "dog", "dog", "cat", "bird", "mouse", "mouse" };
		
		Hashtable<String, Integer> table = new Hashtable<String, Integer>();

		Integer compute = null;
        List<Integer> filesTemp = new ArrayList();

		
		for (String animal : animals) {
		    table.compute(animal, 
		        (key, value) -> (value == null ? 1 : value + 1));
		}
		
		//{cat=2, mouse=2, dog=2, bird=1}
		System.out.println(table);
	}

}
