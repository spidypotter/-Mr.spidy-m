class MyBaseClass{
	protected void disp()
	{
		System.out.println("parent class method");
	}
}
public class MyChlidClass extends MyBaseClass
{
	public void disp()
	{
		System.out.println("child class method");
	}
	public static void main(String[] args) {
		
		MyChlidClass  x1 = new MyChlidClass();
		//MyBaseClass  x2 = new MyBaseClass();
		x1.disp();
		//x2.disp();
	}

}
