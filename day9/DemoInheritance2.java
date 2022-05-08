class A
{
void show()
{ System.out.println("In A");
}
}
class B extends A
{
void disp()
{ System.out.println("In B");
}
}
public class DemoInheritance2
{
 public static void main(String[] args)
 {
 B ob=new B();
 ob.show();
 }}