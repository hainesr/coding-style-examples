import java.util.List;

public class House {

	Door door;
	Window window;
	Roof roof;
	List<Room> rooms;

	public House(Door door, Window window, Roof roof, List<Room> rooms) {
		assert door != null;
		assert window != null;
		assert roof != null;
		assert rooms != null;
		assert rooms.size() != 0;

		this.door = door;
		this.window = window;
		this.roof = roof;
		this.rooms = rooms;
	}

	public void lockUp() {
		door.lock();
		window.lock();
	}

}
