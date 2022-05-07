//Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and 
N.


import java.util.*;
class SumInteger
{
public static void main(String args[])
{int i=1;
Scanner sc =new Scanner(System.in);
System.out .println("enter  no ");
int n=sc.nextInt();
int sum=0;
while(i<=n)
{ sum=sum+i;

i=i+1;}
System.out.println("Sum of all integer" + sum);


}
}