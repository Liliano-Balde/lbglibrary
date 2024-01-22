package library;

public class Book extends Item {

	private boolean audioBook;

	public Book(String title, String author, int yearReleased, boolean audioBook, boolean isItemCheckedOut) {
//		added attributes to super so it brings the values implemented on app
		super(title, author, yearReleased, isItemCheckedOut);
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
				+ ", AUDIO BOOK: " + audioBook + ", Is it checked in? " + isItemCheckedOut() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		Book other = (Book) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.audioBook != other.hasAudioBook()) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(Item o) {

		return this.getAuthor().compareTo(o.getAuthor());
	}

}