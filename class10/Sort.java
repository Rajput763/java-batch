import java.util.*;
import java.io.*;

class Stud{
	String name;
	int age;
	
Stud(String name,int age)
    {
	this.name=name;
     this.age=age;
	 
	}
}


class AgeComparator implements Comparator<Stud>{
           public int compare(Stud s1,Stud s2){
	if(s1.age==s2.age)
	
	  return 0;
	else if(s1.age>s2.age)
      return 1;
    else
      return -1;
    
  }
}

class NameComparator implements Comparator<Stud>{
           public int compare(Stud s1,Stud s2){
	  return s1.name.compareTo(s2.name);
	  }
	}

	class SortList{
	public static void main(String args[]){
	 
	ArrayList<Stud> g=new ArrayList<Stud>();
     
      g.add(new Stud("kirat",19));
	  g.add(new Stud("nitesh",20));
	  g.add(new Stud("baddi",18));
	  g.add(new Stud("dev",17));
	  g.add(new Stud("Rajan",19));
      g.add(new Stud("rohit",14));
		  
      	  System.out.println("Sort by name = " );
		  
	Collections.sort(g,new NameComparator());
	for(Stud sr : g)
	{
		System.out.println(sr.name +" " + sr.age);
	}
	
	System.out.println("Sort by age = ");
	
	Collections.sort(g,new AgeComparator());
	for(Stud sr : g)
	{
		System.out.println(sr.name +" " + sr.age);
	}
	
	}
	}