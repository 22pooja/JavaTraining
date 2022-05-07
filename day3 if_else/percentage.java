/*Write a  program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/


import java.util.*;
class percentage
{
public static void main(String args[])
{
int Physics,Chemistry,Biology,Mathematics,Computer,total;
Scanner sc=new Scanner(System.in);
System.out.println("Enter subjects marks");
Physics = sc.nextInt();
Chemistry = sc.nextInt();
Biology = sc.nextInt();
Mathematics = sc.nextInt();
Computer = sc.nextInt();
total = (Physics+Chemistry+Biology+Mathematics+Computer)/5;

System.out.println("Avrage is : " +total);
if (total>90)
{
System.out.println("Grade A");
}
else if (total>80)
{
System.out.println("Grade B");
}
else if (total>70)
{
System.out.println("Grade C");
}
else if (total>60)
{
System.out.println("Grade D");
}
else if (total>50)
{
System.out.println("Grade E");
}

}


}