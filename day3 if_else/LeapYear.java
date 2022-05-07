//Write a   program to check whether a year is leap year or not.

import java.util.*;
class Leap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out .println("enter  year ");
int y;
y=sc.nextInt();
if(y%4==0  )
{
System.out .println("Leap year  ");
}
else{
System.out .println("Not leap year ");
}
}
}
