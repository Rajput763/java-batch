import java.io.*;
import java.util.*;
class Rock{
public static void main(String[] abc){
 HashMap<String ,String> x=new HashMap<String ,String>();
                     x.put("B", "T");
                    x.put("A" ,"L");
                    x.put("D", "M");
					Set pq=x.entrySet();   //returns Set Collection 
					Iterator i=pq.iterator();   //got iterator object frm Set
					while(i.hasNext()){
					Map.Entry m=(Map.Entry)i.next();   //returns Key,Value pair Entry
					System.out.print(":"+m.getKey());
					System.out.print(":"+m.getValue());
					System.out.println();
}
}
}
           