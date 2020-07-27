package conditionalstmt;

public class DefaultConstructor {

	String Sname;
	Integer rollno;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DefaultConstructor obj=new DefaultConstructor();
System.out.println(obj.Sname); //o/p will be null for both variable since nothing is assigned to those two variables
System.out.println(obj.rollno);
	}

}
