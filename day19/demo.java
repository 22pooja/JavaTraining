//synchronization

class printer
{
void print(String s)
{
try
{  
System.out.print("[" +s);
Thread.sleep(500);
}
catch(Exception e)
{
}
System.out.println("]");
}
}
class Test implements Runnable
{
printer p;
String msg;
Thread t;
Test(String s,printer ob1)
{
t=new Thread(this);
p=ob1;
msg=s;
t.start();
}
public void run()
{
synchronized(p)
{
p.print(msg);
}
}
}
public class demo
{
public static void main(String[] args)
{
printer ob=new printer();
Test t1=new Test("A",ob);
Test t2=new Test("B",ob);
Test t3=new Test("C",ob);
}
}
