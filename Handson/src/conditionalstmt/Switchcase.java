package conditionalstmt;

public class Switchcase {

	String hero="Batman";

	public void heroOrNot()
	{
		switch(hero) {
		case "Bat man":
			System.out.println("Bat man is a super hero");
			break;
		case "Iron man":
			System.out.println("Iron man is a super hero");
			break;
		case "spider man":
			System.out.println("Spider man is a super hero");
			break;
		default:
			System.out.println( hero +" Sorry no guess!!!");
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switchcase obj=new Switchcase();
		obj.heroOrNot();
	}

}
