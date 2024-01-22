package library;

public class Newspaper extends Item {
	private boolean sudoku;
	private String genre;

	public Newspaper(String title, String genre, int yearReleased, boolean sudoku, boolean isItemCheckedOut) {
//		added attributes to super so it brings the values implemented on app
		super(title, genre, yearReleased, isItemCheckedOut);
		this.sudoku = sudoku;
		this.genre = genre;
	}

	public Newspaper() {
		super();
	}

	public boolean hasSudoku() {
		return sudoku;
	}

	public void setSudoku(boolean sudoku) {
		this.sudoku = sudoku;
	}

	public void sudokuPhrase() {
		System.out.println("I borrowed " + getTitle() + " by " + getAuthor() + " released in " + getYearReleased());

	}

	@Override
	public String toString() {
		return "Newspaper [ItemID: " + getItemId() + ", TITLE: " + getTitle() + ", YEAR RELEASED: " + getYearReleased()
				+ ", SUDOKU: " + sudoku + ", Is it checked in? " + isItemCheckedOut() + "]";
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

		Newspaper other = (Newspaper) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.sudoku != other.hasSudoku()) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(Item o) {

		return this.getAuthor().compareTo(o.getAuthor());
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
