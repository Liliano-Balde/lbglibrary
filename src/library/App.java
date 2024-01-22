package library;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		Book lord = new Book("The Lord of the Rings", "J. R. R. Tolkien", 1954, true, true);
		Book power = new Book("50 Laws of Power", "Robert Greene", 1998, false, true);
		Book silent = new Book("The Silent Patient", "Alex Michaelides", 2019, true, false);
//		testing if sysout works, initially didnt due to lack of tostring override, added to book
		System.out.println(lord);
		System.out.println(power);
		System.out.println(silent);

		lord.bookPhrase();
		power.bookPhrase();
		silent.bookPhrase();

		ArrayList<Item> items = new ArrayList<>();

		items.add(new Book("Ulysses", "James Joyce", 1922, true, false));
		items.add(new Book("Don Quixote", "Miguel de Cervantes", 1605, true, true));

		System.out.println(items);

		Library myLibrary = new Library();

		myLibrary.addItem(new Book("Ulysses", "James Joyce", 1922, true, false));
		myLibrary.addItem(new Book("Don Quixote", "Miguel de Cervantes", 1605, true, true));
		myLibrary.addItem(lord);
		myLibrary.addItem(power);
		myLibrary.addItem(silent);
		myLibrary.addPerson(new Person("Liliano", 35, 2005));
		myLibrary.addPerson(new Person("Lucy", 36, 2016));
		myLibrary.addPerson(new Person("Beatriz", 76, 1978));
		myLibrary.addPerson(new Person("toRemove", 99, 9999));
		myLibrary.addItem(new Magazine("Mistica Benfiquista", "monthly", 1995, true, true));
		myLibrary.addItem(new Newspaper("A Bola", "football", 1945, false, true));

		System.out.println(myLibrary);

		myLibrary.updateItemById(6, "Ulysses the traveler", "James Augustine Joyce", 1922);
		myLibrary.updatePersonById(1, "Liliano Balde", 36, 2010);
		myLibrary.checkInById(2);
		myLibrary.removePersonById(4);
		myLibrary.removeItemById(3);

		System.out.println(myLibrary);

	}

}
