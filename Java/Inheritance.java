public class Inheritance {
	public static void main(String[] args) {
		Car newCar = new Car(4);
		System.out.println(newCar.tyres);
	}
}

class Vehicle {
	int tyres;

	Vehicle(int tyres) {
		this.tyres = tyres;
		System.out.println("Vehicle Constructor");
	}
}

class Car extends Vehicle {
	Car(int tyres) {
		super(tyres);
		System.out.println("Car Contructor");
	}
}
