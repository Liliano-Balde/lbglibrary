package library;

import java.util.ArrayList;

public class Library {

	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Person> persons = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public boolean removeItemById(int itemId) {
		for (Item item : this.items) {
			if (item.getItemId() == itemId) {
				this.items.remove(item);
				return true;
			}
		}
		return false;
	}

	public boolean checkOutById(int itemId) {
		for (Item item : this.items) {
			if (item.getItemId() == itemId) {
				item.setItemCheckedOut(true);
				return true;
			}
		}
		return false;

	}

	public boolean checkInById(int itemId) {
		for (Item item : this.items) {
			if (item.getItemId() == itemId) {
				item.setItemCheckedOut(false);
				return false;
			}
		}
		return true;

	}

	public void addPerson(Person person) {
		persons.add(person);
	}

	public boolean removePersonById(int personId) {
		for (Person person : this.persons) {
			if (person.getPersonId() == personId) {
				this.persons.remove(person);
				return true;
			}
		}
		return false;
	}

	public boolean updatePersonById(int personId, String newName, int newAge, int newYearRegistered) {
		for (Person person : persons) {
			if (person.getPersonId() == personId) {
				person.setName(newName);
				person.setAge(newAge);
				person.setYearRegistered(newYearRegistered);
				return true;
			}
		}
		return false;

	}

	public boolean updateItemById(int itemId, String newTitle, String newAuthor, int newYearReleased) {
		for (Item item : items) {
			if (item.getItemId() == itemId) {
				item.setTitle(newTitle);
				item.setAuthor(newAuthor);
				item.setYearReleased(newYearReleased);
				return true;
			}
		}
		return false;

	}

	@Override
	public String toString() {
		return "Library [items=" + items + "]\n[Person=" + persons + "]";
	}

}
