package conditionalstmt;

public class NoArgConstructor {
	int employee_ID;
	String employee_Name;

	NoArgConstructor() //no argument constructor contains no arguments in ().
	{
		employee_ID=252244;
		employee_Name="Preetha";
		System.out.println("Employee obj is created " +employee_Name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NoArgConstructor obj=new NoArgConstructor(); // once object is created, 
		//it calls the no argument constructor and displays the output


	}

}
