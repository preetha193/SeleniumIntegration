package conditionalstmt;

public class StaticMethods {


	public static void method1()
	{
		System.out.println("This is static method and no obj reqd to call");
	}

	public void nonStaticmethod()
	{
		System.out.println("This is non static method and requires object to call");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		StaticMethods obj=new StaticMethods();
		obj.nonStaticmethod();
	}

}
