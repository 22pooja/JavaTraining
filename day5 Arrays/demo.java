import java.util.*;

class demo
{
public static void main(String args[])
{int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int n=sc.nextInt();
int arr[]= new int [n];


for( int i=0;i<n;i++)

{
System.out.println(arr[i]);

}

for( int  i=0;i<n;i++)

{
sum=sum+arr[i];


}
System.out.println("Addition of array is"+sum);
}
}
