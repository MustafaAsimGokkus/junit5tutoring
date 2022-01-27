package junit5tutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class J10DisableTest {

	@Test
	@Disabled //is used to deactivate our test methods
	// junit4==>@Ignore
	void testToFindMin() {
		assertEquals (4,Math.min(4, 10));
		assertEquals (4,Math.min(4, 10),"data does not match");
		
		assertTrue(4==Math.min(4, 10));
		assertTrue(4==Math.min(4, 10),"data does not match");
		
		assertFalse(4!=Math.min(4, 10));
		assertFalse(4!=Math.min(4, 10),"data does not match");
		
	}
	
	@Test
	void testWithArray() {
		
		String str = "Java is easy";
		String actualArr[] =str.split(" ");
		
		String expectedArr[] = {"Java","is","easy"};
		assertArrayEquals(actualArr,expectedArr);
		assertTrue(Arrays.equals(expectedArr, actualArr));
	}
	
	
}
