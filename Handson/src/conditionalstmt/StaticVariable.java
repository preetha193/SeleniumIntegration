package conditionalstmt;

public class StaticVariable {
	static int accountBalance=0; // this variable is shared among all objects so it stores "0" initially and during compile time,
								//it stores 1000 and then last execution will be with obj2 so it stores 2000.
	String depositBy;

public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariable obj1=new StaticVariable();
		StaticVariable obj2=new StaticVariable();
		accountBalance=1000;
		obj1.depositBy="Agni";
		accountBalance=2000;
		obj2.depositBy="Preetha";
		System.out.println("Account Balance:" +accountBalance);
		System.out.println("Deposit by: " +obj1.depositBy);
		System.out.println("Account Balance:" +accountBalance);
		System.out.println("Deposit by: " +obj2.depositBy);


	}

}
