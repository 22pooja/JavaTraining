class A
{
void show()
{System .out.println("in a");
}
}

class B extends A
{
void show()
{
System .out.println("in b");
}
}
class DemoOverride
{
public static void main(String[] args)
{
B ob=new B();
ob.show();
}
}

