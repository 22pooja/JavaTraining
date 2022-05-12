import java.util.*;
class Quiz3
{
public static void main(String []args)
{
int i,squ=0;
int []arr=new int[5];
Scanner sc= new Scanner(System.in);
System.out.println("enter your array");
for ( i = 0; i < arr.length; i++)
 {arr[i]=sc.nextInt();
      System.out.println(arr[i]);
    }

    for (i = 0; i < arr.length; i++) 
    {
    squ= arr[i] * arr[i];
    
    System.out.println("square of array element is" +squ );
  }
}
}