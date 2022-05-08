/* Exercise 1 — Array Sum Examine the following program: 
class Exercise1
{
 public static void main ( String[] args )
 {
 int[] val = {0, 1, 2, 3}; 
 sum = System.out.println( "Sum of all numbers = " + sum );
 }
}
Complete the assignment statement so that it computes the sum of all the numbers in the array. */


class ArraySum {

  public static void main(String args[]) {
    int sum = 0;
    int arr[] = { 2, 1, 4, 5, 4 };

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println("Addition of array is" + sum);
  }
}
