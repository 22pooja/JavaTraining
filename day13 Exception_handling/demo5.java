//throw keyword
import java.util.*;
public class demo5
{
static int div(int x,int y)
{
int z=0;
try
{
z=x/y;
}
catch(ArithmeticException e)

{
throw e;
}
return z;
}
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int a;
try{
a=div(10,0);
System.out.println("division is " +a);

}
catch(Exception e)
{
System.out.println("recaught in main");
}
}



}
