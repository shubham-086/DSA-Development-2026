public class Polymorphism {
	public static void main(String[] args) {
		Developers dev = new Developers();
		dev.calculateSalary();

		Manager m = new Manager();
		m.calculateSalary();
	}
}

class Employee {
	void calculateSalary() {
		System.out.println("Calculating employee salary");
	}
}

class Developers extends Employee {
	@Override
	void calculateSalary() {
		System.out.println("Developer Salary = 50,000");
	}
}

class Manager extends Employee {
	@Override
	void calculateSalary() {
		System.out.println("Manager salary = 80,000");
	}
}