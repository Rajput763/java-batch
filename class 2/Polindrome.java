class Polindrome{
public static void main(String[] abc){

int a=12321;
int x;


int t=a, reverse=0;
while (a>0)
{x=a%10;
reverse=reverse*10+x;
a=a/10;
}

if(t==reverse)
{System.out.println("polindrome");}
else 
{System.out.println("false");}
}
}