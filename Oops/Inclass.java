// Stayic inner class
class Outer{
	int a=10;
	static class Inner{
		int b=20;
	}
}

public class Inclass{
	public static void main(String[] args) {
		Outer.Inner in=new Outer.Inner();
		System.out.println(in.b);
	}
}