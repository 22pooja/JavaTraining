// generics 1
class student
{
int id;
String name;
}
class test<T>
{
T i;
test(T x)
{
i=x;
}
void show()
{

 System.out.println(i);
  System.out.println(i.getClass().getName());
  }
  }
  public class demo
  {
  public static void main(String []args) 
{ test<Integer> ob1=new test<>(10);
test<String> ob2=new test<>("hello");
ob1.show();
ob2.show();
student st=new student();
test<student>ob3=new test<>(st);
ob3.show();
}
}


