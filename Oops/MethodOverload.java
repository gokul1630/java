
class MethodOverload{
	// Method overloading by no of arguments 
	static void add(int a,int b){
		System.out.println("Method overloading by no of arguments");
		System.out.println(a+" "+b);
	}
	static void add(int a,int b,int c){
		System.out.println(a+" "+b+" "+c);
	}

	// Method overloading by data types 
	static void data(double a,double b){
		System.out.println("Method overloading by data types");
		System.out.println(a+" "+b);
	} 
	static void data(String a,String b){
		System.out.println(a+b);
	}
	public static void main(String args[]){

		add(1,2); // Method overloading by no of arguments 
		add(1,2,3);

		data(2.6,3.7);// Method overloading by data types
		data("Gokul ","prasanth");
	}
}