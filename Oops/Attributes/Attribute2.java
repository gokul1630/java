class Attribute2{
	int x=1;//First value was defined here
	public static void main(String args[]){
		Attribute2 n=new Attribute2();
		n.x=10;//It overrides the exsisting value
		System.out.println(n.x);//now it prints value 10
	}
}