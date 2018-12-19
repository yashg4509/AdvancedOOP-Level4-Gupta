package _04_00_IntroToEncapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class EncapsulateTheDataTests {
	EncapsulateTheData e = new EncapsulateTheData();
	
	@Test
	public void testItemsReceived() {
		e.setItemsReceived(-2);
		assertEquals(0, e.getItemsReceived());
	}
	
	@Test
	public void testDegreesTurned() {
		e.setDegreesTurned(90);
		assertEquals(90, e.getDegreesTurned(), 0.1);
	}
	
	@Test
	public void testNomenclature() {
		e.setNomenclature("");
		assertEquals(" ", e.getNomenclature());
	}
	
	@Test
	public void testMemberObj() {
		e.setMemberObj("hi");
		assertFalse(e.getMemberObj() instanceof String);
	}
}
