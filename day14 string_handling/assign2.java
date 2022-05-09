/* 2 .Given two strings, append them together (known as "concatenation") and return the result. 
However, if the concatenation creates a double-char, then omit one of the chars. If the inputs are 
“Mark” and “Kate” then the ouput should be “markate”. (The output should be in lowercase)
String*/

class assign2
{
public static void main(String[] args)
{
String s1="Mark";
String s2="late";
if(s1.substring( s1.length()-1).equalsIgnoreCase( s2.substring(0,1)) )
          System.out.println(  s1.concat( s2.substring(1, s2.length())).toLowerCase() );
                else
                    System.out.println(  s1.concat( s2) );

}
}

