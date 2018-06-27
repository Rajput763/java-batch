import java.lang.String;
import java.util.*;
import java.util.Arrays; 

class So{
		public static <any_type> void printArr(any_type[] inputArr){
		
		
			for(any_type element : inputArr)
			{
			System.out.printf("%s",element);
			}
		
		System.out.println();
		}
	
		public static void main(String args[]){

			Integer[] g={4,6,4,8,9,1};
			
			Arrays.sort(g);
			 System.out.println("Modified arr[] = " + Arrays.toString(g));
			 
			 String[] st={"tiger","sher","ford","cheetah","rock"};
			 
			 Arrays.sort(st);
			  System.out.println("Modified st[] = " + Arrays.toString(st));
			  
			 double du[]={2.2,3.22,4.45,5.67,9.87};
			 
			Arrays.sort(du);
			  System.out.println("Modified du[] = " + Arrays.toString(du));
			  
							}
}

