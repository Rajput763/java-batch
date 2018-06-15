import java .util.Scanner;
class Arraylarge{
public static void main(String[] abc){
int i,j,a,k;
System.out.println("input an array");
Scanner in=new Scanner(System.in);
int arr[]=new int[5];
for(i=0;i<5;i++){
	arr[i] = in.nextInt();
}
for(k=0;k<arr.length;k++)
{
for(j=0;j<arr.length-1;j++)
if(arr[j]>arr[j+1])
{
a=arr[j];
arr[j]=arr[j+1];
arr[j+1]=a;
}}
System.out.println(arr[4]);
}}