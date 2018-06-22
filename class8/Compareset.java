import java.util.*;

class Compareset{

 public static void main(String args[]){
                   Set<String> x=new HashSet<>();
                    x.add("B");
                    x.add("A");
                    x.add("D");
                    x.add("E");
                    x.add("C");
                    x.add("F");
					
					Object[] arr = x.toArray(new String[x.size()]);
                    
					 Set<String> h1=new HashSet<>();
                    h1.add("A");
                    h1.add("a");
                    h1.add("B");
                    h1.add("e");
                    h1.add("f");
                    h1.add("h");
                    
					
			Object[] arg = h1.toArray(new String[h1.size()]);
					
					for(int i=0;i<arr.length;i++)
					{
						for(int j=0;j<arg.length;j++)
						{
							if(arr[i]==arg[j])
								System.out.println(arg[j]);
						}
					}
					}
					}
					