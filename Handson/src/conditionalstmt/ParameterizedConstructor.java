package conditionalstmt;

public class ParameterizedConstructor {
	String animalname;  //variable declaration
	String animaltype;

	ParameterizedConstructor(String name, String type) //parameterized constructor
	{
		animalname=name; // we are assigning the values to other variable and using in the animal()
		animaltype=type;

	}

	public void animal()
	{
		System.out.println("animal name is  "+animalname+" and type is: "+ animaltype);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor obj=new ParameterizedConstructor("Tiger","Carnivores");
		// we need to pass the arguments which is declared in the above constructor class
		obj.animal();
		ParameterizedConstructor obj1= new ParameterizedConstructor("Lion","Carnivores");
		obj1.animal();

	}

}
