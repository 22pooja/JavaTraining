
/* 4 .Write a class MathOperation which accepts integers from command line. Create an array using these 
parameters. Loop through the array and obtain the sum and average of all the elements. Display the 
result. Check for various exceptions that may arise like ArithmeticException, NumberFormatException, 
and so on. For example: The class would be invoked as follows: C:>java MathOperation 1900, 4560, 0, 
32500
Exception handling: throws*/
import  java.util.*;
public class assignment4
{
public static void main(String[] args)
{ int sum=0;
double avg=0;
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter size of array");
n=sc.nextInt();
int [] arr = new int[n];
System.out.println("enter your array");

{
for( int i=0;i<n;i++)

{
arr[i]=sc.nextInt();
System.out.println(arr[i]);

}
try
{

for( int  i=0;i<n;i++)

{
sum=sum+arr[i];
avg=sum/n;

}
/*System.out.println("Addition of array is"+sum);
System.out.println("average of array is"+avg);
}
}*/

catch(ArithmeticException e)
{ System.out.println("ArithmeticException");
}
/*catch(InputMismatchException  e)
{ System.out.println("InputMismatchException ");
}

}*/
System.out.println("Addition of array is"+sum);
System.out.println("average of array is"+avg);
}
}

