//seprate digit and prints its addition

import java.util.*;
class addition

{

public static void main(String args[])
{

int a,b,c,d;


Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
a=sc.nextInt();

b=a/10;
c=a%10;
d=b+c;

System.out.println("addition of 2 digit  is"+d);

}
}
