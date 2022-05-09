// try with multiple  catch
import java.util.*;
public class demo
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
catch(ArithmeticException e)
{System.out.println("can not divide by zero");
}
catch(InputMismatchException e)
{System.out.println("plz enter int value");
}
System.out.println("end");

}
}
