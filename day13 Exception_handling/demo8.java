import java.io.FileInputStream;
import java.io.FileNotFoundException;
//checked and unchecked import java.io.FileInputStream;

class demo8
{  
    static void fun1() throws FileNotFoundException
{
try{

FileInputStream  fin;
fin= new FileInputStream("c:demo8/data.txt");
}
catch(FileNotFoundException e)
{
throw e;
}
}
public static void main(String[] args) 
{
fun1(); 

}
}