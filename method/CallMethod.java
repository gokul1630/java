public class CallMethod{
	public static void main(String[] args){
    CallMethod s=new CallMethod();
         s.add();
	}
      void add(){
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum of a & b is: "+c);//output is 30
	}
}