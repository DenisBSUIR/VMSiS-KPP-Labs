package main;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Choose:");
        //System.out.println("0) ");
        System.out.println("1) f(x) = 1/ln(x)");
        System.out.println("2) f(x) = 7/(x^2+1)");
        System.out.println("3) f(x) = sin(x+1)");

        Scanner in = new Scanner(System.in);

        int choose;
        choose = in.nextInt();


        int x1, x2;
        System.out.println("Input x1, x2");
        x1 = in.nextInt();
        x2 = in.nextInt();



        switch (choose){
            case 0:{
                break;
            }
            case 1: {
                Integral integral = new Integral(1, x1, x2);
                integral.calculate();
                System.out.println(integral.getResult());
                break;
            }
            case 2:{
                Integral integral = new Integral(2, x1, x2);
                integral.calculate();
                System.out.println(integral.getResult());

                break;
            }
            case 3:{
                Integral integral = new Integral(3, x1, x2);
                integral.calculate();
                System.out.println(integral.getResult());

                break;
            }
            default: break;
        }
    }
}
