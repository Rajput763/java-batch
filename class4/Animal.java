
 interface Animal{
	void eat();
 void speak();

public static void main(String[] abc){
	Cat c=new Cat();
	c.eat();
	c.speak();
	Dog d=new Dog();
	d.speak();
	d.eat();
}}
class Cat implements Animal{
public void eat(){
System.out.println("cat eat mouse");}
public void speak(){
System.out.println("cat speak");}
}
class Dog implements Animal{
public void speak(){
System.out.println("dog speak");}
public void eat (){
	System.out.println("dog eat");
}}