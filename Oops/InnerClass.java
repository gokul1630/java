class Out{
	String name="gokul";

	class In{
		String name1=" prasanth";
	}
}

public class InnerClass{
	public static void main(String[] args) {
		Out out=new Out();
		Out.In in=out.new In();
		System.out.println(out.name+in.name1);
	}
}