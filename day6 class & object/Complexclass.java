/*Design a class ‘Complex ‘with data members for real and imaginary part. Provide default and 
Parameterized constructors. Write a program to perform arithmetic operations of two complex 
numbers.*/


import java.util.*;
class Complex
{
  int real,imagi;
 Complex( int r,int i)
{
this.real = r;
this.image = i;

}
void show()
{
System.out.println(this.real + " +i" + this.image);
}
void add(complex n1,complex n2)
{
complex res=new complex(0,0);
res.real=n1.real + n2.real;
res.image = n1.image + n2.image;
 return res;
}
public class Complexclass
{
public static void main(String[]args)
{

Complex c1 = new Complex(4, 5);
Complex c2 = new Complex(10, 5);
  
        c1.showC();
          
        
        c2.showC();
  
        ComplexNumber res = add(c1, c2);
  

        res.showC();
    }
} 
}


