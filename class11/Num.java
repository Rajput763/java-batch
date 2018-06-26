import java.util.*;
import java.lang.Thread;
import java.io.*;

 class Number extends Thread{
    
	 static int j=1;
	 public synchronized void print(){
  
	  for(int i=1;i<=500;i++)
	  {
		  System.out.println(this.j++);
  }}
   public void run(){
	   print();
   }
    

    public static void main(String args[])throws InterruptedException{
	
	 Number s=new Number();
	
    Thread h =new Thread(s);
    Thread k =new Thread(s);
      h.start();
	  k.start();
     }
    }