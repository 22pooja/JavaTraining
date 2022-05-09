class test<T>
{
T i;

void set(T x)
{
i=x;

}
void show()
{
System.out.println(i);

System.out.println(i.getClass().getName());

}}
class demo3
{public static void main(String []args) 
{
test<String>t1=new test<>();
test<Integer>t2=new test<>();
t1.set("hello");
t2.set(100);
t1.show();
t2.show();
}}