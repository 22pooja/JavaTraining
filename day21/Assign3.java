//3.Create an ArrayList which will be able to store only numbers like int,float,double,etc, but not any 
//other data type.

import java .util.*;

class Assign3
{
public static void main(String []args) 
{
ArrayList<Number>ar;
ar=new ArrayList<>();
ar.add(10);
ar.add(20.79);
ar.add(20.26578);
// ar.add();
// ar.add("E");

Iterator<Number> it1;
it1=ar.iterator();
 while(it1.hasNext())
 {
  System.out.println(it1.next());
        }
}
}

