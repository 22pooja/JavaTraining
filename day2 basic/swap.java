/*WAP swap value of two number
i/p =a=10
b=20
o/p
a=20*/


import java.util.*;
class swap

{

public static void main(String args[])
{

int a,b;


Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
a=sc.nextInt();
b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;

System.out.println("swaping number is"+a);

}
}
