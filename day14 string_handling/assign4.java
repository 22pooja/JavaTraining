/*4 .Given a string of even length, return the first half. So the string "CatDog" yields "Cat". If the 
string length is odd number then return null.*/

class assign4
{
public static void main(String[] args)
{
String s1="CatDog";
String s2;
if(s1.length()%2==0)
{
s2=s1.substring(0,s1.length()/2);
}else
{
s2=null;
}
System.out.println( s2);
}
}
