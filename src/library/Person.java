package library;

public class Person {

	private static int personCount = 1;
	private int personId;
	private String name;
	private int age;
	private int yearRegistered;

	public Person() {
		super();
		this.personId = personCount++;
		this.setYearRegistered(yearRegistered);
	}

	public Person(String name, int age, int yearRegistered) {
		super();
		this.personId = personCount++;
		this.setName(name);
		this.setAge(age);
		this.setYearRegistered(yearRegistered);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	@Override
	public String toString() {
		return "Person [UserId=" + personId + ", name=" + name + ", age=" + age + ", Year registered=" + yearRegistered
				+ "]";
	}

}
