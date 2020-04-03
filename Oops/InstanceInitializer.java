// when the object is created InstanceInitializer block
//is first called by object then the constructor block is called by object
class InstanceInitializer{
	InstanceInitializer(){
		System.out.println("Constructor block");
	}
	{System.out.println("InstanceInitializer block");}
	public static void main(String args[]){
		InstanceInitializer init=new InstanceInitializer();
	}
}