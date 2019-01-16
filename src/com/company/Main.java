package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       double empNumber, hourRate, totalHours;
       double weekPay;

       Scanner n = new Scanner(System.in);
        System.out.println("Enter the employee's number");
        empNumber = n.nextInt();
        System.out.println("Total Hours");
        totalHours = n.nextInt();
        System.out.println("Hour Pay Rate");
        hourRate = n.nextInt();

        if (totalHours > 60 || hourRate > 25){
            System.out.println("Inappropriate Entry");}

        else if((totalHours>35 && totalHours <=60) && (hourRate<=25)){
            weekPay =
                    (35*hourRate) + (totalHours-35)*hourRate *1.5;
            System.out.println("Total pay is" +"\t" +weekPay);}

        else if(totalHours<=60 && hourRate <= 25){
            weekPay = totalHours * hourRate;
            System.out.println( "Total pay is" +"\t"  +weekPay);}


    }
}
