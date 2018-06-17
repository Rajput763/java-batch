class Jai{
	public static void main(String[] abc){
	int i,j;
	for (i=0;i<11;i++)
	{
	for(j=0;j<11;j++)
	{
	if(j==0&&i<6)
	{System.out.print("*");}
	else if(i==5&&j<11)
	{System.out.print("*");}
	else if(j==10&&i>5)
	{System.out.print("*");}
else if(j>5&&i==0)
	{System.out.print("*");}
else if(j==5&&i<11)
	{System.out.print("*");}
else if(j<6&&i==10)
	{System.out.print("*");}

	else
	{System.out.print(" ");}
	}
	{System.out.println("");}}}}