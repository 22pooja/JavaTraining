class person
{
String first;
String last;
person(){

 public void setFirst(String first)
{

this.first=first;
}
 public void setLast(String last)
 {
this.last=last;
}
public String getFirst_name()
{
return first;
}
 public String getLast_name()
 {
return Last;
}
}
}

class teacher extends person
{
double annual_salary;
int year;
int Experience;
teacher()
{
public  void  setAnnual_salary(double annual_salary)
this. annual_salary=annual_salary;
}
{ public void  getAnnual_salary()
this.annual_salary
}
public  void  setYear(int year)
this.year=year;
}

{ public void getYear()
return year ;
}
{ public void  setExperience(int Experience)
this.Experience=Experience;
}
{public void getExperience()
return.Experience;
}



}
public class demoperson
{
public static void main(String []args)
{
teacher t1=new teacher();
t1.setAnnual_salary(4000.20);
t1.getAnnual_salary();
t1.setYear(12);
t1.getYear();
t1. setExperience(20);
t1. getExperience();
}
}

