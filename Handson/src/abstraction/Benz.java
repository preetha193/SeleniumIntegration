package abstraction;

public class Benz extends Car {
	
	//Benz also does the overriding

	public void engineSecret()
	{
		System.out.println("BMW engine secret");
	}

	public void companyValut()
	{
		System.out.println("BMW Vault secret");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Benz();
		car.companyValut();
		car.engineSecret();
	}

}
