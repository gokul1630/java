class Private{
	private String name;

	public String getName(){
		return name;
	}
	public void setName(String newname){
		this.name=newname;
	}
}

public class Encapsulation{
	public static void main(String[] args) {
		Private obj=new Private();
		obj.setName("java");
		System.out.println(obj.getName());
	}
}