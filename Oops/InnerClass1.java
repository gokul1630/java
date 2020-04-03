// Access outer class using inner class

class Outt{
	int a=10;
	class Inn{
		public int mymethod(){
			return a;
		}
	}
}

public class InnerClass1{
	public static void main(String[] args) {
		Outt out=new Outt();
		Outt.Inn in=out.new Inn();
		System.out.println(in.mymethod());
	}
}