package polymorphism;

public class OverLoading {

static int a=10;
static int b=20;
static int c=30;
static int d=40;

	public int method1(int a,int b) {

		System.out.println("The result is :" +a);
		return a;
	}

	public int method1(int a,int b,int c)
	{
		System.out.println("The result is :" +c);
		return c;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoading obj=new OverLoading(); //creating an object
		obj.method1(a, b); //though method name is same, we pass different parameters and it calls that method based on the parameter passed.
		obj.method1(a,b,c);

	}

}
