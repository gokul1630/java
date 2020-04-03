class Animal{
	public void animal(){
		System.out.println("this animal makes sound");
	}
}
class Dogs extends Animal{
	public void animal(){
		System.out.println("Dogs is barking");
	}
}
class Polymorphism{
	public static void main(String args[]){
		Animal animal=new Animal();
		Animal dog=new Dogs();
		animal.animal();
		dog.animal();
	}
}