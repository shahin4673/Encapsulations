package Code3;


	
public class MyClass {
	public static void main(String[] args) {
    Employee ep = new Employee("Toufique", 4980, 3.50000000);

    System.out.println("Name is " + ep.getName());
    System.out.println("ID is " + ep.getId());
    System.out.println("Salaray is " + ep.getSalary());
   
    
    System.out.println("");
    ep.setName("Ismot Ara Khan");
    ep.setId(4000);
    ep.setSalary(4.50);
    System.out.println("Name is " + ep.getName());
    System.out.println("ID is " + ep.getId());
    System.out.println("Salaray is " + ep.getSalary());
    
    
}
}
