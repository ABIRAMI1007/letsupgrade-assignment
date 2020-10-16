public class Employee {
	public static void main(String[] args) {
	String name;
	int age;
	String city;	
		Employee emp1 = new Employee();
		emp1.name = "ABIRAMI";
		emp1.age = 20;
		emp1.city = "THIRUVANNAMALAI";
		
		Employee emp2 = new Employee();
		emp2.name = "BHAVO";
		emp2.age = 20;
		emp2.city = "CHENNAI";
		
		System.out.println("\nDetails of Employee-1:");
		emp1.display();
		System.out.println("\nDetails of Employee-2:");
		emp2.display();
		
	public void display(); {
		System.out.println("The name of the Employee is: " + name);
		System.out.println("The age of the Employee is: " + age);
		System.out.println("The city of the Employee is: " + city);
	}
	
	}
}