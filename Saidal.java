

import java.util.Scanner;

public class Saidal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How Many of X :");
        int input = sc.nextInt();
        Double Xvalue[] = new Double[input];
        for (int i = 0; i < Xvalue.length; i++) {
            Xvalue[i] = 0.00;
        }
        Double martix[][] = new Double[input][input + 1];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input + 1; j++) {
                System.out.print("Value of " + i + " " + j);
                martix[i][j] = sc.nextDouble();
            }
        }
        for(int i=0;i<input;i++) {
            opreation(martix, Xvalue, input);

        }
        logValue(Xvalue);
    }

    public static void logValue(Double Xvalue[]) {
        System.out.println("log");
        for (int i = 0; i < Xvalue.length; i++) {
            System.out.println("X" + i + ":" + Xvalue[i]);
        }

    }

    public static void opreation(Double martix[][], Double Xvalue[], int input) {
        Double tmp, value;
        for (int i = 0; i < input; i++) {
            tmp = 0.00;
            value = 0.00;

            for (int j = 0; j < input + 1; j++) {
                if (i == j) {
                    tmp = martix[i][j];
                } else if (j == input) value += martix[i][j];
                else value -= martix[i][j] * Xvalue[j];
            }

           Xvalue[i] = value / tmp;
        }

    }
}


