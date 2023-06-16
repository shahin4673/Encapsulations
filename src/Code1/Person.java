/**
 Example-2
 * We can access the private variables with setter and getter methods of that calss.
 */


package Code1;

/**
 * @author Toufique
 *
 */
public class Person {

	private String name;
	private int age;


public void setName(String name)
{
  this.name =name;	
}
public void setAge(int age)
{
  this.age =age;	
}
public String getName()
{
  return name;
}
public int getAge()
{
  return age;
}
}
	
