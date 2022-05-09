abstract class account
{
/*void getCustInfo()
{
System.out.println("get customer info);
}*/
abstract void calculateInterest();
}
class saving extends account
{
void calculateInterest()
{
System.out.println(" calculate interest of savings");
}
}
class loan extends account
{
 void calculateInterest()
{
System.out.println("calculate Interest of loan");
}
}
class accountFactory
{
public static account  getAccount(String type)
{
account obj=null;
if (type.equalsIgnoreCase("saving"))
{
obj=new saving();
}
else
{
   obj=new loan();
   }
   return obj;
   }
   }
   public class demoFactory
   {
   public static void main(String []args)
   {
   account ob1=accountFactory.getAccount("loan");
   ob1. calculateInterest();
   ob1=accountFactory.getAccount("saving");
   ob1.calculateInterest();
   }
   }
