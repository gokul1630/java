//Abstract methods

abstract class Animal{
	public abstract void method(); // abstract method doesn't have body
	public void sound(){
		System.out.println("regular method");
	}
}
class Myclass extends Animal{
	public void method(){ //abtract method was defined here
		System.out.println("abstract method");
	}
}

public class Abstract{
	public static void main(String[] args) {
		Myclass obj=new Myclass();
		obj.method();
		obj.sound();
	}
}