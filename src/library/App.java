package library;

public class App {

	public static void main(String[] args) {

		Book lord = new Book("The Lord of the Rings", "J. R. R. Tolkien", 1954, true);
//		testing if sysout works, initially didnt due to lack of tostring override, added to book
		System.out.println(lord);

		lord.bookPhrase();
	}

}
