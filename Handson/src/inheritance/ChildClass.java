package inheritance;

public class ChildClass extends ParentClass{
	
	int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj= new ChildClass();
		obj.method1();  // we are calling method1() from parent class using the object created in child class.
		int i=obj.Carnum; // we are declaring the variable "i" in child class and assigning the carnum data from parent class so it gets 8585.
		System.out.println(i);
		

	}

}
