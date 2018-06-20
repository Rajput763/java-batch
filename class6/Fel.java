import java.io.*;
class Fel{
public static void main(String[] abc) throws IOException{
File f=new File("E:\\1.txt");
FileInputStream fis=new FileInputStream(f);
int c;
while((c=fis.read())!=-1){

System.out.print((char)c);
}
}
}