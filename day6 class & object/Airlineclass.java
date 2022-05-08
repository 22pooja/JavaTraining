/*Create a class that captures airline tickets. Each ticket lists the departure and arrival cities, a 
flight number, and a seat assignment. A seat assignment has both a row and a letter for the seat 
within the row (such as 12F). Make two examples of tickets*/


import java.util.*;
class Airline
{
int fnumber;
String dcity,acity,assignment;
Scanner sc=new Scanner(System.in);
void data() 
{
System.out.println("Enter flight number : ");
fnumber=sc.nextInt();
System.out.println(" lists the departure cities: ");
dcity=sc.next();
System.out.println(" lists the  arrival cities");
acity=sc.next();
System.out.println(" lists the  seat assignment ");
assignment=sc.next();



}
void Show()
{
System.out.println(" Enter flight number : " + fnumber );
System.out.println(" lists the departure and arrival cities " + dcity+ " " +acity );
System.out.println("lists the  seat assignment  : " + assignment );
}

}
public class Airlineclass
{
public static void main(String[]args)
{
Airline s1=new Airline(); 
Airline s2=new Airline();

s1.data();
s2.data();
s1.Show();
s2.Show();
}
}

