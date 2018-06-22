 import java.lang.String;  
import java.util.Scanner;
import java.io.*;  
import java.util.*;
class Demo{
public static void main(String[] abc){
	int i;int arr[]=new int[10];
Scanner in =new Scanner(System.in);
try{

for(i=0;i<11;i++){
arr[i]=in.nextInt();}}
	
	
	catch(Exception a){
	 System.out.println(a);  
	
		int size=(int)(arr.length*1.5f);
		int arg[]= new int[size];
		System.arraycopy(arr,0,arg,0,arr.length);
		for(int k=11;k<size;k++){
			arg[k] = in.nextInt();
		}
		for (int j=0;j<arg.length;j++)
		System.out.print(arg[j]+" ");
		
		
	}
			
}
}


