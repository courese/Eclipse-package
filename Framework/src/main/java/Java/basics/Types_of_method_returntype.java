package Java.basics;

public class Types_of_method_returntype {
	public int a = 6; //Global variable
	public int b = 6; //Global variable
	public int c;	  //Global variable
	//Method without parameter and without returntype
	public void operation() {
		int c = a*b;
		System.out.println("a*b is" +c);
	}
	//Method without parameter and with returntype
	public int Sum()
	{
		int c = a+b;
		System.out.println("a+b is" +c);
		return c;
	}
	//Method with parameter and with returntype
	public int sub(int a, int b)
	{
		int c = a-b;
		System.out.println("a-b is" +c);
		return c;
	}
	//Method withparameter and without returntype
	public void Division(int a, int b)
	{
		int c = a/b;
		System.out.println("a/b is" +c);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Types_of_method_returntype Sample = new Types_of_method_returntype();
		Sample.operation();
		Sample.Sum();
		Sample.sub(10, 5);
		Sample.Division(10, 5);
	}
	

	}

