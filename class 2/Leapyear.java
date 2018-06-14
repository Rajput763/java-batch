class Leapyear{
public static void main(String[] abc){
int a=1900;
if(a%400==0)
{System.out.print("true");}
else if (a%100==0)
{System.out.print("false");}
else if (a%4==0)
{System.out.print("true");}
else{System.out.print("false");}
}

}