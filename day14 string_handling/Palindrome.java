/* 1 .Write a Program that will check whether a given String is Palindrome or no*/


import java.util.*; 
class Palindrome  
{  
   public static void main(String args[])  
   {  
      String s1, reverse="" ;  
      Scanner sc = new Scanner(System.in);   
      System.out.println("Enter a string or number ");  
      s1 = sc.next(); 
       
      int length = s1.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + s1.charAt(i);  
      if (s1.equals(reverse))
      {  
         System.out.println("Entered string is a palindrome."); 
         } 
      else { 
         System.out.println("Entered string is not  palindrome.");
         }   
   }  
}  