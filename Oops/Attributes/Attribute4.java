class Attribute4 {
	int x=10; //object 1 Variable is declared here
	public static void main(String[] args) {
		Attribute4 a=new Attribute4();// Object 1
		Attribute4 b=new Attribute4();// Object 2
          b.x=20;// x variable is defined with object2 so it won't override the object 1 variable
		  System.out.println(a.x);// prints 10
		  System.out.println(b.x);//prints 20
	}
}