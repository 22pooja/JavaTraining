// lambda function

interface A<T>     // function interface
{
T add(T x,T y);
}
 class demoLambdaFun
 {
 public static void main(String []args)
 {
 

A<Integer>ob =(x,y)->x+y;

System.out.println(ob.add(100,200));
}
}