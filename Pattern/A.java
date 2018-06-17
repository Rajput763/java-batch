	class A{
	public static void main(String[] abc){
	int i,j;
	for (i=0;i<8;i++)
	{
	for(j=0;j<8;j++)
	{
		if(i==j || i+j==8-1)
			{System.out.print("*");}
		else if(i==0 &&j<8)
		{System.out.print("*");}
	else if(i<8 &&j==7)
	{System.out.print("*");}
else if(i==7&&j<8)
	{System.out.print("*");}
else if(i<8&&j==0)
	{System.out.print("*");}
else
	{System.out.print(" ");}}
	{System.out.println();}}
	}}