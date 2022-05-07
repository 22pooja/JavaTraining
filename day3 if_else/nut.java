/*Write a program that asks the user for the number of bolts, nuts, and washers in their purchase 
and then calculates and prints out the total. As an added feature, the program checks the order. A 
correct order must have at least as many nuts as bolts and at least twice as many washers as blots, 
otherwise the order has an error.*/


import java.util.Scanner;

public class nut {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        int b,n,w;
        System.out.println("Number of bolts : ");
        b = ob.nextInt();
        System.out.println("Number of nuts : ");
        n = ob.nextInt();
        System.out.println("Number of waherss : ");
        w = ob.nextInt();
        if(n!=b){
            System.out.println("Check the Order : Too few nuts");
        }else if(b!=(2*w)){
            System.out.println("Check the Order : Too few washers");
        }else{
            System.out.println("Order is OK");
        }
        double total = (5*b)+(3*n)+(w);
        System.out.println("Total cost : "+ total);
    }
    }