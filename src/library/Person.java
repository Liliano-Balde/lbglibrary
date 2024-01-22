package library;

public class Person {

	private static int personCount = 1;
	private int personId;
	private String name;
	private int yearRegistered;

	public Person() {
		super();
		this.personId = personCount++;
		this.setYearRegistered(yearRegistered);
	}

	public Person(String name, int yearRegistered) {
		super();
		this.setName(name);
		this.personId = personCount++;
		this.setYearRegistered(yearRegistered);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPersonId() {
		return personId;
	}

	public int getYearRegistered() {
		return yearRegistered;
	}

	public void setYearRegistered(int yearRegistered) {
		this.yearRegistered = yearRegistered;
	}

}
