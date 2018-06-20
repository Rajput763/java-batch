 import java.lang.String;  
import java.util.Scanner;

class Sub{
public static void main(String[] abc){
	
Scanner x= new Scanner(System.in);
String y=x.nextLine();
for(int i=0;i<y.length();i++)
{
for(int j=1;j<y.length()-i;j++){
 String s=y.substring(i,i+j);
System.out.println(s);
}
}
}}
