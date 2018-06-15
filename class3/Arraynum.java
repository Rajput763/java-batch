import java .util.Scanner;
class Arraynum{
public static void main(String[] abc){
int arr[]={7,3,9,36,78};
int a,i;
Scanner in=new Scanner(System.in);
a=in.nextInt();
for(i=0;i<=arr.length;i++)
{
if(arr[i]==a) 
System.out.print("array num");
else
System.out.println("not in array");
}
}
}