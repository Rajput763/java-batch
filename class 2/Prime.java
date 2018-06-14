import java.util.Scanner;
class Prime{
public static void main(String[] abc){

int i,j;
int a;
Scanner in =new Scanner(System.in);
a=in.nextInt();
int count=0;
for (i=2;i<=a;i++)
{
	
for(j=1;j<=i;j++){
if(i%j==0){
count++;
}
}
if(count==2)
{System.out.println("prime "+i);}
count=0;
}

}
}