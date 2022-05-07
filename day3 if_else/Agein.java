
import java.util.*;
public class Agein {
    public static void main(String[] args){
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter number of years : ");
        double year = ob.nextDouble();
        double temp = 0;
        System.out.println("Enter number of  months : ");
        double month = ob.nextDouble();
        System.out.println("Enter number of  days : ");
        double days = ob.nextDouble();
        while(month<=12){
            month = month-12;
            year++;
        }
        if(month<=5){
            days = days+151;
            month = 0;
        }else if(month<=12){
            days = days+(month*30);
            month = 0;
        }
        days = days + (year*365);
        temp = 24*days;
        double minutes = temp*60;
        double seconds = minutes*60;
        double life = 2500000000.0;
        double lspan = (seconds/life)*100;
        System.out.println("Your percentage of Life Span is : "+ lspan);

    }
}

