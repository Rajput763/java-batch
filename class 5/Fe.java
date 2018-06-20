import java.util.Scanner;
class Vowel{
public static void main(String[] abc){
int i;
Scanner in= new Scanner(System.in);
String y=in.nextLine();
StringBuffer sbr = new StringBuffer();
for(i=0;i<y.length();i++){
	if((y.charAt(i)!='a')&& (y.charAt(i)!='e') && (y.charAt(i)!='i')&& (y.charAt(i)!='o') && (y.charAt(i)!='u') && (y.charAt(i)!='A') && (y.charAt(i)!='E') && (y.charAt(i)!='I') && (y.charAt(i)!='O') && (y.charAt(i)!='U'))
	{sbr.append(y.charAt(i));
	}
}

System.out.println(sbr);

}}