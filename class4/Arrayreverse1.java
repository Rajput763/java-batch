import java.util. Scanner;

class Arrayreverse1{
public static void main(String[] abc){
int i,j,x,k;
Scanner in =new Scanner(System.in);
int arr[]=new int[6];
for(i=0;i<6;i++){
arr[i]=in.nextInt();}
{
for(j=0;j<arr.length-1;j+=2)
{x=arr[j];
arr[j]=arr[j+1];
arr[j+1]=x;
}}
for (k=0;k<arr.length;k++)
{System.out.println(arr[k]);
}}}