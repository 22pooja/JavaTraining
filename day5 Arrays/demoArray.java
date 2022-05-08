import java.util.*;

class demoArray {
1
  public static void main(String args[]) {
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array  ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("your array ");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
