class MethodOverload {
	static int sumInt(int a,int b){
		return a+b;
    }
	static double sumDouble(double a,double b){
		return a+b;
    }
      public static void main(String args[]){
      int add = sumInt(10,20);
        System.out.println(add);
      double db= sumDouble(5.0, 5.0);
        System.out.println("\n"+db);  

    }
}     