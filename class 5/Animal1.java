abstract class Animal1{
String breed ,color,name;

Animal1(String br , String clr , String nm){
	this.breed = br;
	this.color = clr;
	this.name = nm;
}
Animal1(){}

abstract public void speak();
public void eat(){System.out.println("speaking");}
}
class Dog extends Animal1{

Dog(String br , String clr , String nm){
	//super(br , clr , nm );
	this.breed = br;
	this.color = clr;
	this.name = nm;
}
public void display(){
	System.out.println(breed);
	System.out.println(color);
	System.out.println(name);
}
public void speak(){System.out.println("barking");}

}
class Demo{
public static void main(String[] abc){
Dog x=new Dog("labrador" , "black" , "harris");
x.display();
x.speak();
}}