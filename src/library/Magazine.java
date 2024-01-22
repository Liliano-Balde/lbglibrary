package library;

public class Magazine extends Item {

	private boolean souvenir;
	private String periodicity;

	public Magazine(String title, String periodicity, int yearReleased, boolean souvenir, boolean isItemCheckedOut) {
//		added attributes to super so it brings the values implemented on app
		super(title, periodicity, yearReleased, isItemCheckedOut);
		this.souvenir = souvenir;
		this.periodicity = periodicity;
	}

	public Magazine() {
		super();
	}

	public boolean hasSouvenir() {
		return souvenir;
	}

	public void setSouvenir(boolean souvenir) {
		this.souvenir = souvenir;
	}

	public void souvenirPhrase() {
		System.out.println(
				"I borrowed " + getTitle() + " which is released " + periodicity + " released in " + getYearReleased());

	}

	@Override
	public String toString() {
		return "Magazine [ItemID: " + getItemId() + ", TITLE: " + getTitle() + ", PERIODICITY: " + periodicity
				+ ", YEAR RELEASED: " + getYearReleased() + ", SOUVENIR: " + souvenir + ", Is it checked in? "
				+ isItemCheckedOut() + "]";
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

		Magazine other = (Magazine) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.souvenir != other.hasSouvenir()) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(Item o) {

		return this.getAuthor().compareTo(o.getAuthor());
	}

	public String getperiodicity() {
		return periodicity;
	}

	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}

}
