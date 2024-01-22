package library;

import java.util.ArrayList;

public class LibraryIventory {

	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Person> persons = new ArrayList<>();

	public void add(Item item) {
		items.add(item);
	}

	public void remove(Item item) {
		items.remove(item);
	}

	public void checkOut(Item item) {
		item.setItemCheckedOut(true);

	}

	public void checkIn(Item item) {
		item.setItemCheckedOut(false);
	}

	public void add(Person person) {
		persons.add(person);
	}

	public void remove(Person person) {
		persons.remove(person);
	}

	public void updatePerson(int personId, String newName, int newYearRegistered) {
		for (Person person : persons) {
			if (person.getPersonId() == personId) {
				person.setName(newName);
				person.setYearRegistered(newYearRegistered);
				return;
			}
		}

	}

}
