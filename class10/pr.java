import java.io.*;
import java.util.Scanner;


 public class GenericMethodTest {
        
        public static < E > void printArray( E[] inputArray ) {
            
            for(E p : inputArray) {
                System.out.println(p);
            }
            
 }}
 
 
 
 class pr{
	 
			public static void main(String[] abc){
			//	Scanner str= new Scanner(System.in);
//E [] intArray =new intArray[5];
		//	for(int i=0;i<5;i++)
				
			   Integer[] intArray = { 1, 2, 5, 9, 5 };
			// {   E pqr=str.next();}
    Double[] doubleArray = { 1.6, 2.5, 8.2, 9.94,  98.2, 7.9 };
    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
			GenericMethodTest j=new GenericMethodTest();
j.printArray(intArray);
j.printArray(doubleArray);
j.printArray(charArray);

    
	
        }
		}