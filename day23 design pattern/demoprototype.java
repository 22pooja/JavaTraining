import java.util.ArrayList;
class student implements Cloneable
{
ArrayList<String>ar;

student()
{
ar=new ArrayList<>();
}
student (ArrayList<String> t)
{
ar=t;
}
void loadData()
{
ar.add("A");
ar.add("B");
ar.add("C");
ar.add("D");

}
void show()
{
System.out.println(".................");
for(String s:ar)
{
System.out.println(s);
}
System.out.println(".................");
}
protected Object clone() throws CloneNotSupportedException {



ArrayList<String> ar2;
ar2=new ArrayList<>();
for(String s:ar)
{
 ar2.add(s);
 }
student obj=new student(ar2);
return obj;
}
}

public class demoprototype
{
public static void main(String []args) throws Exception
{
student st1=new student();
        st1.loadData();
        st1.show();
         student st2=(student)st1.clone(); 
     st2.show();
        st2.ar.remove("C");
        System.out.println("st1 object");
        st1.show();
        System.out.println("st2 object");
        st2.show();

    }
}

