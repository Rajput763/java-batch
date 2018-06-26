 import java.lang.String;  
import java.util.Scanner;
class Word{
public static void main(String[] args){
Scanner sc= new Scanner (System.in);
String y=sc.nextLine();
 
 String[] wrds = y.split(" ");
 System.out.println(wrds.length);
}
}