import static org.junit.Assert.assertEquals;

import java.util.Hashtable;

import org.junit.Test;

public class RepetadedStringTest {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {

		String[] letras = createString(s, n).split("");

		Hashtable<String, Integer> table = new Hashtable<String, Integer>();

		for (String letra : letras) {
			table.compute(letra, (key, value) -> (value == null ? 1 : value + 1));
		}

		return table.get("a");
	}

	@Test
	public void test1() {
		assertEquals("abcabcabca", createString("abc", 10));
	}

	@Test
	public void test2() {
		assertEquals(4, repeatedString("abc", 10));
	}

	@Test
	public void test3() {
		assertEquals(7, repeatedString("aba", 10));
	}

	@Test
	public void test4() {
		assertEquals(10000000, repeatedString("a", 10000000));
	}

	static String createString(String string, long size) {

		char[] letter = string.toCharArray();

		StringBuilder result = new StringBuilder();
		int j = 0;
		for (int i = 0; i < size; i++) {
			if (j == letter.length) {
				j = 0;
			}
			result = result.append(letter[j]);
			j++;
		}

		return result.toString();

	}

}
