//singleton pattern

class sequence
{
static  sequence obj=null;
static int count;
private sequence()
{
count=0;
}
static synchronized sequence getInstance()

{
if(obj==null)
{
obj =new sequence();
System.out.println(" object is created");
}
count++;
System.out.println("count is" +count);
return obj;
}
}
public class demoSingleton
{
public static void main(String []args)
{sequence s1= sequence.getInstance();
sequence s2= sequence.getInstance();
sequence s3= sequence.getInstance();
sequence s4= sequence.getInstance();
}}
