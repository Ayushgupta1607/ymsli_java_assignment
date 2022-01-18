package q4;

class Student {
	private String id;
	private String name;
	private double grade;

	public Student(String id) {
		this.id = id;
	}

	public Student(String id, String name) {
		this(id);
		this.name = name;
	}

	public Student(String id, String name, double grade) {
		this(id, name);
		this.grade = grade;
	}

	public void display() {
		if (id != null) {
			System.out.println("ID: " + id);
		}
		if (name != null) {
			System.out.println("Name: " + name);
		}
		if (grade != 0.0) {
			System.out.println("Grade: " + grade);
		}
		System.out.println();
	}

	public void display(int year) {
		System.out.println("Year: " + year);
		this.display();
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("ym351");
		student1.display();
		Student student2 = new Student("yn351", "Ayush");
		student2.display();
		Student student3 = new Student("ym351", "Ayush", 99);
		student3.display(2022);
	}

}
