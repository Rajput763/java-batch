 
import java.util.Scanner;
import java.lang.String;
 public class Revers{
	
public static void main(String[] abc){
Scanner str= new Scanner(System.in);
String pqr=str.nextLine();

 String reverse="";
 for ( int i=pqr.length()-1;i>=0;i--)
 {reverse=reverse  + pqr.charAt(i);
 }
 System.out.println(reverse);
 }}