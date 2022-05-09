/* 7 Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and 
otherwise return the string unchanged. If the input is "xHix", then output is "Hi".
String*/

class assign7
{
public static void main(String[] args)
{
String s="xHix";
if(s.charAt(0)=='x')
{
s=s.substring(1,s.length());
}
if(s.charAt(s.length()-1)=='x')
{
s=s.substring(0,s.length()-1); 
}
System.out.println( s);
}
}
