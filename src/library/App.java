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

		myLibrary.add(new Book("Ulysses", "James Joyce", 1922, true, false));
		myLibrary.add(new Book("Don Quixote", "Miguel de Cervantes", 1605, true, true));
		myLibrary.addPerson(new Person("Liliano", 35, 2005));
		myLibrary.addPerson(new Person("Lucy", 36, 2016));
		myLibrary.addPerson(new Person("Beatriz", 76, 1978));

		System.out.println(myLibrary);

	}

}
