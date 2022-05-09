class test<T,V>
{
T i;
V j;

test(T x,V y)
{
i=x;
j=y;
}void show()
{
System.out.println(i);

System.out.println(i.getClass().getName());
System.out.println(j);
System.out.println(j.getClass().getName());
}}
class demo2
{public static void main(String []args) 
{
test<String,Integer>ob1=new test("hello", 100);
ob1.show();
}}