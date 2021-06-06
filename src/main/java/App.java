import java.util.Scanner;


/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
 *A = P(1 + rt), P is principal amount, r is interest rate annually, t time years
 *           "Computing Simple Interest" output
 *Enter the principal: 1500
 *Enter the rate of interest: 4.3
 *Enter the number of years: 4
 *After 4 years at 4.3%, the investment will be worth $1758.
 */
public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();

        System.out.print("Enter the principal: ");
        double principal = in.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = in.nextDouble();
        System.out.print("Enter the number of years: ");
        int time = in.nextInt();

        double total = myApp.calculateSimpleInterest(principal, rate, time);

        System.out.printf("After %d years at %.3f%%, the investment will be worth $%.2f.\n", time, rate, total);
    }

    private double calculateSimpleInterest(double P, double r, int t)
    {
        double result = P * (1 + ((r/100) * t));
        double temp = result;

        temp *= 100;

        if(temp%1 != 0 && temp%1 >= 0.5)
        {
            result -= (temp%1)/100;
            result += 0.01;
        }
        else if(temp%1 != 0)
            result -= (temp%1)/100;

        return result;

    }
}