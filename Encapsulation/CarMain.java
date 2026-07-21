package Encapsulation;

public class CarMain {

	public static void main(String[] args) {

		Car c = new Car();
		c.setModelNo(123);
		c.setCarName("TATA");
		c.setPrice(45000.0);

		System.err.println("Car Information");
		System.out.println("Car Model NO: " + c.getModelNo());
		System.out.println("Car Name: " + c.getCarName());
		System.out.println("Car Price: " + c.getPrice());
	}
}
