/*Static vs. Non-Static
 *You will often see Java programs that have either static or public attributes and methods.
 *
 *In the example below, we created a static method, which means that it can be accessed without 
 *creating an object of the class, unlike public, which can only be accessed by objects:
 *
 *@author Gokulprasanth
 *
 */



class ClassMethod{
	static void method1(){ // static method
		System.out.println("Hi");//here we can print statements without creating new object
	}
	public void method2(){ // public method
		System.out.println("Hello");//here we need to create an object for printing statements
	}
	public static void main(String[] args) {
		method1();//prints "Hi" in output
		ClassMethod obj=new ClassMethod();//here i Created a "obj" object for printing "method2" method
		obj.method2();//prints "Hello" in output
	}
}