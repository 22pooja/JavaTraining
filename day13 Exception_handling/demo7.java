import java.io.FileInputStream;
//finally block
class demo7
{
static void div1()
{try
{
   int a;
   a=10/0;
}
catch(ArithmeticException e)
{
System.out.println("can not divisible by zero");
}
finally
{
  System.out.println("always executed");
  }
  }
static void div2()
{try
{
   int a;
   a=10/2;
}
catch(ArithmeticException e)
{
System.out.println("can not divisible by zero");
}
finally
{
  System.out.println("always executed");
  }
  }
static void div3()
{try
{
   return;
}
catch(ArithmeticException e)
{
System.out.println("can not divisible by zero");
}
finally
{
  System.out.println("always executed");
  }
  }
public static void main(String[] args)
{
div3();
div1();
div2();
}
}