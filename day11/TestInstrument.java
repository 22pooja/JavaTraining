/*Create an abstract class Instrument which is having the abstract function play. Create three more 
sub classes from Instrument which is Piano, Flute, Guitar. Override the play method inside all 
three classes printing a message “Piano is playing tan tan tan tan ” for Piano class “Flute is 
playing toot toot toot toot” for Flute class “Guitar is playing tin tin tin ” for Guitar class You 
must not allow the user to declare an object of Instrument class. Create an array of 10 
Instruments. Assign different type of instrument to Instrument reference. Check for the 
polymorphic behavior of play method. Use the instanceof operator to print that which object 
stored at which index of instrument array*/

abstract class Instrument
{
public abstract void play();
}
class piano extends Instrument
{
    abstract void play()
{
System.out.println("Piano is playing tan tan tan tan");
}
}
class flute extends Instrument
{  
    abstract void play();
{
System.out.println("Flute is playing toot toot toot toot");
}
}
class guitar extends Instrument
{  
      abstract void play()
{
  System.out.println("Guitar is playing tin tin tin");
} 
}
public class TestInstrument
{
public static void main(String[] args) 
{
    Instrument arr=new Instrument[3];
    
    for(int i=0;i<2;i++)
    {
    arr[0]=new piano();
    arr[1]=new flute();
    arr[2]=new guitar();
    }
    


    
