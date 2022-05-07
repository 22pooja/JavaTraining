/*It is sometimes hard to think in terms of radians; we would rather use degrees. Remember (from 
those dark days of trigonometry class) that there are PI radians per 180 degrees. So to convert an 
angle given in degrees to radians do this: 
rad = degrees * Math.PI/180
Math.PI gives you an accurate value of PI. 
Edit the previous program so that it does the same things, but the angle is 30 degrees (which you 
will convert into radians.)*/

import java.util.*;
class rad
{
public static void main(String args[])
{
double r;
double d;
System.out.println("enter value " );
Scanner sc=new Scanner(System.in);
d=sc.nextDouble();
r=d*Math.PI/100;
System.out.println("radian value "+r );



}
}