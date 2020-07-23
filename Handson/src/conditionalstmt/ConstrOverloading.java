package conditionalstmt;

public class ConstrOverloading {
	String draw;
	ConstrOverloading()
	{
		System.out.println("no arg constructor");
	}
	ConstrOverloading(String toDraw)
	{

		String draw=toDraw;
		System.out.println("parameterized constructor " +draw);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstrOverloading obj= new ConstrOverloading(); //it goes to default constructor
		ConstrOverloading obj1=new ConstrOverloading("circle"); //it goes to parameterized constructor

	}

}
