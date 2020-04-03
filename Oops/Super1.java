class Dog{
	void eat(){
		System.out.println("dog is eating");
	}
}
class Dogg extends Dog{
	void bark(){
		System.out.println("dog id barking");
	}
	void eat(){
		System.out.println("dog id again eating");
	}
	void dogaction(){
		super.eat();
		bark();
		//eat();
	}
}
class Super1{
	public static void main(String[] args) {
	Dogg dog=new Dogg();
	dog.dogaction();	
	}
}