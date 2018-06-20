import java.io.*;
class Nagni{
public static void main(String[] abc) throws IOException{
File f=new File("E:\\1.txt");
File g=new File("E:\\2.txt");

FileInputStream fis=new FileInputStream(f);
FileOutputStream k=new FileOutputStream(g);
int c;
while((c=fis.read())!=-1){
k.write(c);
k.flush();
}
}
}





