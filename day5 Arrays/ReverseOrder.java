/* 2. Write a program   to read n number of values in an array and display it in reverse order. 
Test Data : 
Input the number of elements to store in the array :3 
Input 3 number of elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 7 
Expected Output : 
The values store into the array are : 
2 5 7 
The values store into the array in reverse are : 
7 5 2 */


class ReverseOrder
{
public static void main(String args[])
{

int arr1[]={0,1,2,3};
int temp;
System.out.println("original value :" + arr1[0]+" "+arr1[1]+" "+arr1[2]+" "+arr1[3]);
System.out.println("Reversed order");
for( int i=arr1.length-1;i>=0 ;i--)

{


System.out.println(""+arr1[i]);

}
}
}

