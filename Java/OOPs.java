public class OOPs {
	public static void main(String[] args) {
		Student stu1 = new Student("Rahul", "B.Tech", 1);
		// Student stu2 = new Student("Aditya", "B.Tech");

		// stu1.study();
		System.out.println(stu1.course);

		Car obj = new Car("BMW", "Blue", 2026);
	}
}

class Car {
	String brand;
	String color;
	int model;

	Car(String carBrand, String carColor, int carModel) {
		brand = carBrand;
		color = carColor;
		model = carModel;
	}

	void accelerate() {
		System.out.println("Car is running");
	}

	void applyBreak() {
		System.out.println("Car Stopped!");
	}
}

class Student {
	String name;
	String course;
	int rollNo;

	Student(String name, String course, int rollNo) {
		this.name = name;
		this.course = course;
		this.rollNo = rollNo;
	}

	void study() {
		System.out.println("Studying!");
	}

	void play() {
		System.out.println("Playing Basket ball");
	}
}