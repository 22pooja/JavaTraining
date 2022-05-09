//toCharArray()
//getBytes()
class demo
{
public static void main(String[] args) 
{
   String s1="ABC";
   char arr[];
   arr=s1.toCharArray();
   int i;
   for(i=0; i<arr.length;i=i+1)
   {  System.out.println(arr[i]);
   }
   
   // convert string object into byte array
   byte[] arr1;
   arr1=s1.getBytes();
    for(i=0; i<arr.length;i=i+1)
   {  System.out.println(arr1[i]);
   }
   }
   }

   
