class Address{
	String street,city,state;

	Address(String street,String city,String state){
		this.street=street;
		this.city=city;
		this.state=state;
	}
}

class Aggregation{
	String name;
	int id;
	Address address;

	Aggregation(String name,int id,Address address){
		this.name=name;
		this.id=id;
		this.address=address;
	}

	void display(){
		System.out.println(name+" "+id);
		System.out.println(address.street+" "+address.city+" "+address.state);
	}

	public static void main(String args[]){
		Address address=new Address("Raja Street","Salem","Tamil nadu");
		Aggregation student=new Aggregation("Gokul",15101,address);
		student.display();
	}
}