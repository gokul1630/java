class Instances{
	Instances(){
		System.out.println("Constructor block");
	}
}
class InstanceInitializer1 extends Instances{
	InstanceInitializer1(){
		super();
		System.out.println("Constructor Block 1");
	}

{System.out.println("InstanceInitializer block");}
	public static void main(String[] args){
		InstanceInitializer1 initial=new InstanceInitializer1();
	}
}