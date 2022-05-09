/*Hands-on Assignments for Interfaces
No. Hands-on Assignment Topics Covered Status
1
A library needs to develop an online application for two types of users/roles, Adults and 
children. Both of these users should be able to register an account.
Any user who is less than 12 years of age will be registered as a child and they can borrow a 
“Kids” category book for 10 days, whereas an adult can borrow “Fiction” category books which 
need to be returned within 7 days.
Note: In future, more users/roles might be added to the library where similar rules will be 
enforced.
Develop Interfaces and classes for the categories mentioned above.
1. Create an interface LibraryUser with the following methods declared, Method Name 
registerAccount requestBook
2. Create 2 classes “KidUsers” and “AdultUser” which implements the LibraryUser 
interface.
3. Both the classes should have two instan*/

 interface LibraryUser
 {
 void registerAccount(int age);
 void requestBook(String book_type);
 }
 class KidUsers implements LibraryUser
  {
  int age;
  String book_type;
 public  void  registerAccount(int age)
  {
  this.age=age;
   if(age>12)
  {
  System.out.println("You have successfully registered under a Kids Account");
  }
  else
  { 
   
  System.out.println("Sorry, Age must be less than 12 to register as a kid");
  }
  }
 public  void  requestBook(String book_type)
  {this. book_type= book_type;
   
   if(book_type=="kids")
   {
    System.out.println(" Book Issued successfully, please return the book within 10 days");
    }
    else
    {
    System.out.println("Oops, you are allowed to take only kids books");
    }
    }
    }
    
 class AdultUser implements LibraryUser
  {
   int age;
  String book_type;
 public void  registerAccount(int age)
  {this.age=age;
  if(age<12)
  {
  System.out.println(" You have successfully registered under an Adult Account");
  }
 else
  { 
   
  System.out.println("Sorry, Age must be greater than 12 to register as an adult");
  }
  }
  public void  requestBook(String book_type)
  {
  this.book_type=book_type;
  if(book_type=="Fiction")
   {
    System.out.println(" Book Issued successfully, please return the book within 7 days");
    }
    else
    {
    System.out.println(" Oops, you are allowed to take only adult Fiction books");
      }
      }
      }
      
 class LibraryInterfaceDemo
      {
      public static void main(String[] args)
      {
      KidUsers ob1=new KidUsers();
      AdultUser ob2=new AdultUser();
      ob1.registerAccount(18);
      ob1. requestBook("kids");
      ob2.registerAccount(12);
       ob2. requestBook("fiction");
       }
       }
       
      