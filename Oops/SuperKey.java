class Super{
	String name="Gokul";
}
class Key extends Super{
	int id=10020;
	void main(){
		System.out.println(super.name);
		System.out.println(id);
	}
}
class SuperKey extends Super{
	public static void main(String args[]){
		Key key=new Key();
		key.main();
	}
}