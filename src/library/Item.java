package library;

public abstract class Item implements Comparable<Item> {

	private static int itemCount = 1;
	private int itemId;
	private String title;
	private String author;
	private int yearReleased;
	private boolean itemCheckedOut;

	public Item() {
		super();
		this.itemId = itemCount++;
		this.setItemCheckedOut(false);
	}

	public Item(String title, String author, int yearReleased, boolean itemCheckedOut) {
		super();
		this.itemId = itemCount++;
		this.setItemId(itemId);
		this.setTitle(title);
		this.setAuthor(author);
		this.setYearReleased(yearReleased);
		this.setItemCheckedOut(false);

	}

	public void update(String newTitle, String newAuthor, int newYearReleased) {
		setTitle(newTitle);
		setAuthor(newAuthor);
		setYearReleased(newYearReleased);
	}

	public int getItemid() {
		return itemId;
	}

	public void setItemId(int itemid) {
		this.itemId = itemid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

	public boolean isItemCheckedOut() {
		return itemCheckedOut;
	}

	public void setItemCheckedOut(boolean itemCheckedOut) {
		this.itemCheckedOut = itemCheckedOut;
	}

}
