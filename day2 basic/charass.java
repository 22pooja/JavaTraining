/* Exercise 3
The following program uses primitive data type char: 
public class CharAssassination
{
 public static void main ( String[] args )
 {
 char ch = 'A' ;
 System.out.println("A char: " + ch );
 }
}
The variable ch is 16 bits of main memory that uses the char data type to represent characters. 
The a bit pattern that represents 'A' is placed in it. The program writes: */



public class charass
{
public static void main(String args[])
{
//char ch= "A"; //error: incompatible types: String cannot be converted to char
 //char ch= '' ;//error: empty character literal
char ch= ' ';// show  A char:


System.out.println("A char: " + ch);

}
}