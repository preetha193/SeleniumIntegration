package conditionalstmt;

public class Ifelse {

	boolean isCupEmpty=true; //cup is empty


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ifelse obj=new Ifelse(); //class object name=new class()
		if(obj.isCupEmpty) // objname.boolean variable
		{
			System.out.println("Fill the cup");

		}else
		{
			System.out.println("Drink the cup");
		}

	}

}
