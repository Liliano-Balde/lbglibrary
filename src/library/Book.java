package library;

public class Book extends Item {

	private boolean audioBook;

	public Book(String title, String author, int yearReleased, boolean audioBook) {
//		added attriutes to super so it brings the values implemented on app
		super(title, author, yearReleased);
		this.audioBook = audioBook;
	}

	public Book() {
		super();
	}

	public boolean hasAudioBook() {
		return audioBook;
	}

	public void setAudioBook(boolean audioBook) {
		this.audioBook = audioBook;
	}

	public void bookPhrase() {
		System.out.println("I borrowed " + getTitle() + " by " + getAuthor() + " released in " + getYearReleased());

	}

	@Override
	public String toString() {
		return "Book [ID: " + getItemid() + ", TITLE: " + getTitle() + ", YEAR RELEASED: " + getYearReleased()
				+ ", AUDIO BOOK: " + audioBook + "]";
	}

}