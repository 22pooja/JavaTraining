import java.util.*;
class demoArraySearch
{
public static void main(String args[])
{int i,item;
int arr[]={1,2,3,4,5,2,1};
boolean isFound=false;
Scanner sc =new Scanner(System.in);
System.out.println("enter item to search ");
item=sc.nextInt();
for(  i=0;i<arr.length;i++)
{if(item==arr[i])
{

 isFound=true;
break;
}
}
if( isFound=true)
{
System.out.println(" item is found ");
}
else
{
System.out.println(" item is not found ");
}}}
