package nivel1_ej01;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MonthTest {
	
	ArrayList<String> monthList = new ArrayList<String>();

	@Test
	void testMonthList() {
		Month.genList(monthList);
		int result = 12;
		Assertions.assertEquals(result, monthList.size());
	}
	@Test
	void testNotNull() {
		Month.genList(monthList);
		Assertions.assertNotNull(monthList);
	}
	@Test
	void testAgosto() {
		Month.genList(monthList);
		String result = "Agosto";
		Assertions.assertEquals(result, monthList.get(7));
		
	}
}
