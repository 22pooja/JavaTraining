
//wait() and notify()
class share{
int x;
boolean f=false;
synchronized void get()
{
try {
    if(f==false)
    {
    wait();
    }
    }catch(Exception e)
    {
    //
    }
 System.out.println("got" +x);
 f=false;
 notify();
 }
 
 synchronized void set(int y)
 {
try {
 if(f==true)
    {
    wait();
    }
    }catch(Exception e)
    {
    //
    }
    x=y;
 System.out.println("put " +x);
 f=true;
 notify();
}
}
class producer implements Runnable
 {
 Thread t;
 share ob;
producer(share ob1)
 {
 t=new Thread(this);
 ob=ob1;
 t.start();
 }
 public void run()
 {
 int i=0;
 while(true)
 {
 ob.set(i);
 i++;
 }
 }
 }

 class consumer implements Runnable
 {
 Thread t;
 share ob;
consumer(share ob1)
 {
 t=new Thread(this);
 ob=ob1;
 t.start();
 }
 public void run()
 {
 int i=0;
 while(true)
 {
 ob.get();
 i++;
 }
 }
 }
 public class demo5
{
public static void main(String []args) 
{ share ob=new share();
producer p=new producer(ob);
consumer c=new consumer(ob);
}
}



