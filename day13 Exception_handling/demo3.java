//new way to handle exception by using single catch
import java.util.*;
public class demo3
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("enter 2 number");
a=sc.nextInt();
b=sc.nextInt();
try{
c=a/b;
System.out.println("division is " +c);
}
catch(ArithmeticException|InputMismatchException e)
{ 
if(e instanceof ArithmeticException )
{
System.out.println("can not divide by zero");
}
else if(e instanceof InputMismatchException)
{
System.out.println("plz enter int value");
}
}
System.out.println("end");

}
}
