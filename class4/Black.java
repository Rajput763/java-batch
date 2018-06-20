class Black{
public void print(int i,float f){
	System.out.println(i);
	System.out.println(f);
}

public void print(){
	System.out.println("no");
}

public static void main(String[] abc){
Black b=new Black();
b.print(6,7.6f);
b.print();
}
}