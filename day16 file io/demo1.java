//dataoutputstream
import java.io.*;
public class demo1
{
  public static void main(String[] args) throws Exception
  {
  FileOutputStream fout;
  fout=new  FileOutputStream("C:\\Users\\shree\\Desktop\\java traning\\test3.txt");
  DataOutputStream dout;
  dout=new   DataOutputStream(fout);

  
   dout.writeInt(102);
   
   dout.writeBoolean(true);
    dout.writeDouble(1.2);
    
     dout.close();
     }
     }
  
