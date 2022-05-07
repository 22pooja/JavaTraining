//3. Write a   program to check whether a number is divisible by 5 and 11 or not.



import java.util.*;
class Divisible
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out .println("enter  no ");
int a;
a=sc.nextInt();
if(a%5==0  )
{
System.out .println("A is Divisible by 5  ");
}
else if(a%11==0)
{
System.out .println("A is divisible by 11 ");
}
else{
System.out .println("Neither divisible by 5 nor 11 ");
}
}
}
