/*WAP to take radius input from user and calculate area of circle*/

import java.util.*;
class area
{
public static void main(String []args)
{
double rd;
double area;
Scanner sc=new Scanner(System.in);
System.out.println("enter radius");
rd=sc.nextDouble();
area=3.14*rd*rd;
System.out.println("the area of circle is "+area);
}
}
