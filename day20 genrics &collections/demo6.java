class test<T extends Number>
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
class demo6
{public static void main(String []args) 
{
test<Integer>t2=new test<>();
t2.set(100);
t2.show();
}}