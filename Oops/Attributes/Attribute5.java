/*
* Multiple Attributes in Class
*/
class Attribute5{
 String a="Gokul";// Attribute 1
 String b="prasanth";// Attribute 2
    int c=20;
    public static void main(String[] args) {
    	Attribute5 d=new Attribute5();
    	System.out.println("Name: "+d.a.concat(d.b));// here i used concat method to add two strings
    	System.out.println("Age: "+d.c);
    }
}