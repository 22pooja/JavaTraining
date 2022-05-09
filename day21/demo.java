import java.util.*;
class demo
{
public static void main(String []args) 
{
LinkedList<Integer>list;
list=new LinkedList<>();
list.add(10);
list.add(20);
list.add(30);
list.addFirst(40);
System.out.println(list);
Integer x=1;
//list.remove(x);
list.remove(0);
System.out.println(list);
}
}