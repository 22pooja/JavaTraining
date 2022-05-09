//univarsal catch block
import java.util.*;
public class demo4
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("enter 2 number");

try{
a=sc.nextInt();
b=sc.nextInt();

c=a/b;
System.out.println("division is " +c);
}
catch(Exception e)
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
