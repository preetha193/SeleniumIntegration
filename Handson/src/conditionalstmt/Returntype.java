package conditionalstmt;

public class Returntype {

	public Integer collectedAmount=1000;

	public Integer transaction()
	{
		System.out.println("amount received " +collectedAmount);
		return collectedAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Returntype obj=new Returntype();
		Integer receivedamt=obj.transaction();
		System.out.println("received amount " +receivedamt);

	}

}
