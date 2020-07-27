package abstraction;

public abstract class Car {

	
	/*Once child class creates its own methods [override], so no use of the same method in parent class.
So parent class converts its methods to “abstract”.
*/
	/* if there is no block of code for a method, change it as abstract */
	
	public abstract void companyValut();

	public abstract void engineSecret();

	// if even one method is abstract, the entire class is abstract
	// abstract class can also have methods with implementation[block of code]
	//no object can be created for abstract class.
	
}
