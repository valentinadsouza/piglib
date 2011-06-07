package com.buildndeploy.piglatin;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TextUtilTest {

	@Test
	public void testParse() {
		String sentence = "First third fifth!";
		List<String> pieces = TextUtil.toList(sentence);
		List<String> expected = new ArrayList<String>();
		expected.add("First");
		expected.add(" ");
		expected.add("third");
		expected.add(" ");
		expected.add("fifth");
		expected.add("!");
		
		assertEquals("Lists not the same", expected, pieces);
	}
	
}