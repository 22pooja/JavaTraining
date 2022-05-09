/*2. WAP to write the content of file and calculate how many words present in thet file*/
import java.io.*;
public class assign2 {
    public static void main(String[] args)throws Exception {
       
        FileInputStream fin;
        fin=new FileInputStream("C:\\Users\\shree\\Desktop\\java traning\\test1.txt");
        StringBuffer sb;
        sb=new StringBuffer();

        int x;
        System.out.println(fin.available());
         do{
            x=fin.read();
            if(x!=-1){
                sb.append((char)x);
            }
        } 
        while(x!=-1);
        System.out.println(sb.toString());
        fin.close();
        System.out.println();
        
    }

}

       
        
    



