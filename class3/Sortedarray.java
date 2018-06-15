class Sortedarray{
public static void main(String[] abc){
int i,j,x;

int arr[]={5,9,2,7,9,2};
for(j=0;j<arr.length;j++)
{
for(i=0;i<arr.length-1;i++)
if(arr[i]>arr[i+1])
{x=arr[i];
arr[i]=arr[i+1];
arr[i+1]=x;}
}
for(int k=0;k<arr.length;k++){
	
	System.out.print(arr[k]+" ");
}
}
}