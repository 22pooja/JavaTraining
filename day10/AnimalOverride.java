/*Create a class named ‘Animal’ which includes methods like eat() and sleep(). Create a child class 
of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly(). 
Create an instance of Animal class and invoke the eat and sleep methods using this object.Create 
an instance of Bird class and invoke the eat, sleep and fly methods using this object.*/

class Animal
{

void eat()
{
System.out.println(" in eat method");
}
void sleep()
{
System.out.println("in sleep method");

}

}
class Bird extends  Animal
{
void eat()
{
super.eat();
System.out.println("override eat");
}
void sleep()
{
super.sleep();
System.out.println("override sleep");
}
void fly()
{
System.out.println("in fly method");
}
}
class AnimalOverride
{
public static void main(String[] args)
{Animal ob1=new Animal();
Bird ob2= new Bird();
ob1.eat();
ob1.sleep();
ob2.eat();
ob2.sleep();
ob2.fly();
}}