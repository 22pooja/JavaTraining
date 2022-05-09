/*WAP to copy the content of one file to another by using CHAR IO classes.*/

import java.io.*;
class assign1
{
public static void main(String []args) throws Exception
{
FileInputStream r=new FileInputStream("C://Users//shree//Desktop//java traning//test1.txt");
FileOutputStream w=new FileOutputStream("C://Users//shree//Desktop//java traning//blank.txt");
System.out.println("file copied...");
int x;
while((x=r.read())!=-1)
w.write((char)x);
r.close();
w.close();
}
}

