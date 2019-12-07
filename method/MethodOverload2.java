class MethodOverload2{
	static int addInt(int a,int b){
		return a+b;
	}
	static double addInt(double a, double b){
		return a+b;
	}
	public static void main(String args[]){
       int a=addInt(10,20);
       System.out.println(a);
       double b=addInt(1.5,1.5);
       System.out.println(b);
	}
}