package conditionalstmt;

public class Threeconditions {


	String myhero="Super man";

	public void heroguess()
	{
		if(myhero.equalsIgnoreCase("SUPER MAN"))
		{
			System.out.println("super man is correct");
		}else if(myhero.equals("Bat man"))

		{
			System.out.println("Bat man is correct");
		}
		else
		{
			System.out.println("Sorry no guess!!");
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threeconditions object=new Threeconditions();
		object.heroguess();
	}

}
