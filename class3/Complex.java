class Complex{
int real;
int imaginary;
void setReal(int a)
{real=a;}
void setImaginary(int b)
{imaginary=b;}
void Display()
{
 System.out.println(real+ "+" +imaginary+ "i");
}
public static void main(String[] abc){
Complex c=new Complex();
c.setReal(3);
c.setImaginary(4);
c.Display();
 }}