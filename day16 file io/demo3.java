//dataoutputstream
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable
{
private int id;
private String name;

public int getId()
{
return id;
}
public void setId(int id)
{
this.id=id;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}
}

public class demo3
{
  public static void main(String[] args) throws Exception
  {

student st;
st =new student();
st.setId(1234);
st.setName("asd");
FileOutputStream fout;
fout=new FileOutputStream("C:\\Users\\shree\\Desktop\\java traning\\studentinfo.txt");
ObjectOutputStream out;
out=new ObjectOutputStream(fout);
out.writeObject(st);
out.close();
}
}

/////output show in studentinfo file