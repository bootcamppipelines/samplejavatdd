package samplejavatdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApplicationTest {

	@Test
	public void sumTest() {
		Application myApplication = new Application();
		int result = myApplication.sum(3, 5);
		assertEquals(result, 8);
	}

}
