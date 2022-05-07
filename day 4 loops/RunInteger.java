/*Write a program that asks the user for a starting value and an ending value and then writes all the 
integers (inclusive) between those two values.*/ 

import java.util.*;
class RunInteger
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out .println("enter 2 no ");
int a=sc.nextInt();
int z=sc.nextInt();
int i;
for(i=a;i<=z; i=i+1)
{ 
System.out.println(i );

}
}
}