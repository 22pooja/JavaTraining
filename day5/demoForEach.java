
class demoForEach
{
public static void main(String args[])
{
int arr[]={2,1,4,5,4};


for( int i=0;i<arr.length;i++)

{
System.out.println(arr[i]);

}
System.out.println("By using for each");
for( int x: arr)

{
System.out.println(x);

}
}
}
