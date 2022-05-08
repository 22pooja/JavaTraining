/*Create classes that capture bank customers and bank accounts. A customer has a first and last 
name. An account has a customer and a balance. Make objects for two accounts held by the 
same customer.*/


class Customer
{
String fname,lname;


void setFname(String fname)
{
this.fname=fname;
}
void getFname()
{
return fname;
}
void setLname(String fname)
{
this.lname=lname;
}
void getLname()
{
return lname;
}
class Account
{
int balance;
customer cust;

void showAccount()
{
system.out.println("fname"+cust.getFname);
system.out.println("lname"+cust.getLname);
system.out.println("balance"+balance);
}
Account(customer cust,int balance)
{
this.cust=cust;
this.balance=balance;
}
}
public Democonstructor
{
public static void main(String args[])

{
Customer ob=new Customer();
ob1.setFname("abc");
ob1.setLname("xcv");
int x=1000;
Account acc1=new Account(ob1,x);
Account acc1=new Account(ob,2000);
ob2.deposit(3000);
ob1.deposit(1500);
ob1.print();
ob2.withdraw(2000);
ob2.print();
}
}

 





