//	Write a   program to input angles of a triangle and check whether triangle is valid or not.



import java.util.*;

class triangle
{
public static void main(String args[])
{
int  a,b,c,s ;

Scanner sc=new Scanner(System.in);
System.out .println("enter 2  year ");
a=sc.nextInt();

b=sc.nextInt();
c=sc.nextInt();
s=a+b+c;
if( s==180 )
{
System.out .println("it is triangle  "+s);

}
else 
{
System.out .println("it is not triangle  ");
}
}
}