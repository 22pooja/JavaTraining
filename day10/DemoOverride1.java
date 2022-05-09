class A extends Object
{

public String toString()
{
return "this is object of class a";
}
}

class B extends A
{
public String toString()
{
return "this is object of class b";
}
}

punlic class DemoOverride1

public static void main(String[] args)
{

A ob1=new A();
B ob2=new B();
System .out.println(ob1);
System .out.println(ob2);
System .out.println(ob1.toString);
System .out.println(ob2.toString);

}
}

