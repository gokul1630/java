class A{
	void a(){
		System.out.println("A");
	}
}
class B extends A{
	void b(){
		System.out.println("B");
	}
}
class C extends A{
	void c(){
		System.out.println("C");
	}
}
class Inheritance{
	public static void main(String args[]){
		B o=new B();
		C c=new C();
		o.a();
		o.b();
		c.c();
	}
}