package library;

public abstract class Item {

	private static int itemCount = 1;
	private int itemId;
	private String title;
	private String author;
	private int yearReleased;

	public Item() {
		super();
		this.itemId = ++itemCount;
	}

	public Item(String title, String author, int yearReleased) {
		super();
		this.itemId = ++itemCount;
		this.setItemId(itemId);
		this.setTitle(title);
		this.setAuthor(author);
		this.setYearReleased(yearReleased);

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

	public static int getitemCount() {
		return itemCount;
	}

	public static void setItemCount(int itemCount) {
		Item.itemCount = itemCount;
	}

}
