//WAP convert meter to feet and inches

import java.util.*;
class meter
{
public static void main(String [] args)
{
double m,f,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter meter");
m=sc.nextDouble();
f=m*3.28084;
i=m*39.37;

System.out.println("measurement in feet  :"+f + "and measurement in inches  :"+i);
}
}

