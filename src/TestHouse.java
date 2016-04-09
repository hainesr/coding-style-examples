import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestHouse {

	@Test
	public void testSecure() {
		Door door = new Door();
		Window window = new Window();

		House house = new House(door, window, null, null);

		house.lockUp();

		assertTrue(door.isLocked());
		assertTrue(window.isLocked());
	}

}
