package Encapsulation;

public class PersonDetails {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Arjun");
		p.setAge(23);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}
