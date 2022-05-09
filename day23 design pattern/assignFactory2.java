abstract class data
{

abstract void calculateArea();
}
class Triangle extends data
{
void calculateArea()
{
System.out.println(" calculate area of triangle");
}
}
class Square extends data
{
 void calculateArea()
{
System.out.println("calculate area of square");
}
}
class dataFactory
{
public static data  getData(String type)
{
data obj=null;
if (type.equalsIgnoreCase("Triangle"))
{
obj=new Triangle();
}
else
{
   obj=new Square();
   }
   return obj;
   }
   }
   public class assignFactory2
   {
   public static void main(String []args)
   {
   data ob1=dataFactory.getData("Triangle");
   ob1. calculateArea();
   ob1=dataFactory.getData("Square");
   ob1.calculateArea();
   }
   }
