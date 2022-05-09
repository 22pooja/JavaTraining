/*Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in 
this class. Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the 
notice function in each of them to print notice suitable to the type of the compartment. Create a class 
TestCompartment . Write main function to do the following: Declare an array of Compartment of size 
10. Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4. 
Check the polymorphic behavior of the notice method.
Abstract Classes */

import java.util.Random;
abstract class Compartment
{
public abstract String notice();

}
class FirstClass extends Compartment
{
  public  String notice()
  {
  return "you are in FirstClass";
}
}
class  Ladies extends Compartment
{
public  String notice()
  {
  return "You are in Ladies Compartment";
}

}
class  General  extends Compartment
{ 
public  String notice()
  {
  return "you are in General" ;
}

}
class  Luggage extends Compartment
{ 
public  String notice()
  {
  return "you are in  Luggage " ;
}
}
public class TestCompartment
{
public static void main(String[] args) 
{
Compartment [] arr=new  Compartment[10];

  Random r =new  Random();
  for (int i = 0; i < 10; i++) {
	    		int rNum = r.nextInt((4 - 1) + 1) + 1;
	    	
	    		if (rNum == 1)
	    			arr[i] = new Luggage();
	    		else if (rNum == 2)
	    			arr[i] = new Ladies();
	    		else if (rNum == 3)
	    			arr[i] = new General();
	    		else if (rNum== 4)
	    			arr[i] = new FirstClass();
	    	
	    		System.out.println(arr[i].notice());
	    	}

}
}

  
