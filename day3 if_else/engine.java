/*Exercise 2 — Steam Engine Efficiency
The maximum possible efficiency of a steam engine depends on the temperature of the steam in 
the boiler and the temperature of the outside air: 
efficiency = 1 - Tair / Tsteam
where Tair is the air temperature and Tsteam is the steam temperature. The temperatures are 
give in degrees above absolute zero. Normal air temperature is about 300oK. Boiling is 373oK. 
Write a program that asks the user for the air temperature and the steam temperature and writes 
out the maximum possible efficiency of a steam engine. However, if the steam temperature is 
less than 373oK there is no steam, so the efficiency is zero. 
Use integer or floating point input, but do the calculations in floating point.*/


import java.util.*;
class engine
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out .println("enter  2 temp ");
double tair,tsteam,eff;
tair=sc.nextDouble();
tsteam=sc.nextDouble();
if(tsteam>=373 && tair!= tsteam )
{
eff=1-(tair/tsteam);
System.out .println("max efficiency "+eff);
}
else{
}
}
}
