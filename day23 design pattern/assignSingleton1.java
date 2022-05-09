class Test
{
static Test obj=null;

private Test()
{
}
static synchronized Test getInstance()
{
if(obj==null)

{
obj=new Test();
System.out.println("...Singleton pattern...");
}
return obj;
}
}
class assignSingleton1
{
public static void main(String []args)
{  Test s1=  Test.getInstance();
 // Test s2=  Test.getInstance();
//  Test s3= Test.getInstance();
//  Test s4=  Test.getInstance();
}}
