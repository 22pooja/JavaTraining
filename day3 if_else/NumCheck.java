//Write a   program to check whether a number is negative, positive or zero.


import java.util.*;
class NumCheck

{

public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers");

a=sc.nextInt();
if(a>0){
System.out.println("entered numbers is positive");

}
else if(a==0)
{
System.out.println("entered numbers is zero");

}
else if(a<0){
System.out.println("entered numbers is negative");

}
else{}
}
}
