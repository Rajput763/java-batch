class Student{
	int length;
	int breadth;
	
void setLength(int x)
{length=x;}
void setBreadth(int y)
{breadth=y;}
void calculateArea(){
int area=length*breadth;
System.out.print(area);
}
public static void main(String[] abc){
Student s=new Student();
s.setLength(5);
s.setBreadth(4);
s.calculateArea();
}
}