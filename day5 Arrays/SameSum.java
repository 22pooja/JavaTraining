/* Exercise 4 — Same Sum
Examine the following program: 
class Exercise4
{
 public static void main ( String[] args )
 {
 int[] valA = { 13, -22, 82, 17}; 
 int[] valB = { 0, 0, 0, 0};
 
 // Put values into valB so that the sum of the values
 // in corresponding cells of valA and valB is 25.
 System.out.println( "valA: " 
 + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
 System.out.println( "valB: " 
 + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );
 System.out.println( "sum: " 
 + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " 
 + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
 }
}
Complete the program with four assignment statements that put values into valB so that the sum 
of corresponding cells in valA and valB is 25.*/

class SameSum
{
public static void main(String args[])
{
int i;
int arr1[]={13,-22,82,17};

int arr2[]={0,0,0,0};
for(  i=0;i<arr1.length;i++)

{
arr2[i]=25-arr1[i];

}


System.out.println("arr1 :" + arr1[0]+" "+arr1[1]+" "+arr1[2]+" "+arr1[3]);
System.out.println("arr2 :" + arr2[0]+" "+arr2[1]+" "+arr2[2]+" "+arr2[3]);
System.out.println("sum :" + (arr1[0] +arr2[0])+" "+(arr1[1]+arr2[1])+" "+(arr1[2]+arr2[2])+" "+(arr1[3]+arr2[3]));
}
}
