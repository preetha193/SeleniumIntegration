package conditionalstmt;

public class Childclass extends Parent {


	public Childclass() //constructors can have access modifier say public but no static,final,abstract
	{
		
		//super(); by default we have this super() used in inheritance for parent and child relationship where this constructor calls the parent class internally
		
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		Childclass obj=new Childclass();
	}
}
