import java .util. Scanner;
class Greatest{
public static void main(String[] abc){
Scanner x=new Scanner(System.in);
int a=x.nextInt();
int b =x.nextInt();
int c =x.nextInt();
if (a>b&&a>c)
System.out.println("a is greater");
else if(b>a&&b>c)
System.out.println("b is greater");
else 
System.out.println("c is greater");

}}