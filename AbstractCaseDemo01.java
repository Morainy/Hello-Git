public class AbstractCaseDemo01
{
	public static void main(String args[])
	{
		A a=new B();
		a.print();
	}
}
abstract class A
{
	abstract public void print();
} 
class B extends A
{
	public void print()
	{
		System.out.println("print()");
	}
}