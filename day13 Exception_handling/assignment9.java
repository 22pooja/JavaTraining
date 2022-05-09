
/* 9 Write a program that accepts 2 integers a and b as input and finds the quotient of a/b. This program 
may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. In 
the catch block, print the message as shown in the sample output. Also illustrate the use of finally block. 
Print the message “Inside finally block”. Sample Input and Output 1: Enter the 2 numbers 5 2 The 
quotient of 5/2 = 2 Inside finally block Sample Input and Output 2: Enter the 2 numbers 5 0 
DivideByZeroException caught Inside finally block
Exception Handling: Finally block*/

import java.util.*;
public class assignment9
{
public static void main(String[] args) 
{Scanner sc=new Scanner(System.in);
try
{
System.out.println("enter 2 no");

int a=sc.nextInt();
int b=sc.nextInt();
int r=a/b;
System.out.println("result is "  +r);
}
catch(ArithmeticException e)
{
   System.out.println(e + " exception caught");
   }
   finally
   {
   System.out.println("always executed");
   }
   }
   }
 


