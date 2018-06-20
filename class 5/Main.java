class Test{



static{
System.out.println("static block");
}

Test(){
System.out.println("static");
}

}

class Main{
public static void main(String[] abc){
Test t1=new Test();
}}