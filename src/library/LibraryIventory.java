package library;

import java.util.ArrayList;

public class LibraryIventory {

	private ArrayList<Item> items = new ArrayList<>();

	public void add(Item item) {
		items.add(item);
	}

	public void remove(Item item) {
		items.remove(item);
	}

}
