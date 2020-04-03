class Computer{
	Computer(){
		System.out.println("key 1 is pressed");
	}
}
class Cpu extends Computer{
	Cpu(){
		super();
		System.out.println("key 2 is pressed");
	}
}
class Superkey1{
	public static void main(String args[]){
		Cpu cu=new Cpu();
	}
}