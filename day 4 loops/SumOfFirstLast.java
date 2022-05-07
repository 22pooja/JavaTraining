//Write program to find the sum of first and last digit of any number(number may contain 
//3 digit,4 digit or 5 digit)


import java.util.*;
class SumOfFirstLast
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter number");
int number=sc.nextInt();
int first=0;
int last=0;
int sum=0;
int c=0;
last=number%10;
System.out.println("last :" +last);
int n=number;
while(n!=0)
{
c++;
n=n/10;
}
first=number/(int)Math.pow(10,c-1);
System.out.println("first :" +first);
sum=last+first;
System.out.println("sum of first and last digit :" +sum);
}
}