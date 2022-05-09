/*5 .Given a string, return a version without the first and last char, so "Wipro" yields "ipr". The string 
length will be at least 2*/

class demo5
{
public static void main(String[] args)
{
String s1="wipro";
s1=s1.substring(1,4);  // you can use this (s1.length()-1) insted of 4
System.out.println( s1);
}
}
