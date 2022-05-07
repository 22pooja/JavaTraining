/*WAP to input basic salary of an employee and calculate its gross salary according to following:
HRA=20%  DA=80%
Gross salary=  HRA + DA + Basic salary*/

import java.util.*;
class gross

{

public static void main(String args[])
{
double b,HRA , DA, g_salary;
Scanner sc=new Scanner(System.in);
System.out.println("basic salary");
b=sc.nextDouble();
HRA=0.20*b;
DA=0.80*b;
g_salary=HRA+DA+b;

 System.out.println("gross salary IS :"+ g_salary );
 }
 }

