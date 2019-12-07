 class Attribute3{
	final int x=10; //final Attribute is defined for preventing override another values
	public static void main(String[] args) {
		Attribute3 a=new Attribute3();
		  a.x=1;
		  System.out.println(a.x);// in output it generates an error
	}
}