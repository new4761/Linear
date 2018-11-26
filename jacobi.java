package work;

import java.util.Scanner;

public class jacobi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many of X :");
        int input = sc.nextInt();
        Double Xvalue[] = new Double[input];
        Double Checkjaco[] = new Double[input];
        for (int i = 0; i < Xvalue.length; i++) {
            Xvalue[i] = 0.00;
            Checkjaco[i] = 5.00;
        }
        Double martix[][] = new Double[input][input + 1];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input + 1; j++) {
                System.out.print("Value of " + i + " " + j);
                martix[i][j] = sc.nextDouble();
            }
        }
        do {
            opreation(martix, Xvalue, input, Checkjaco);
           //logValue(Xvalue);
        } while (CheckJaco(Checkjaco, Xvalue));
        logValue(Xvalue);
    }

    public static boolean CheckJaco(Double Checkjaco[], Double Xvalue[]) {
        boolean check = true;
        for (int i = 0; i < Checkjaco.length; i++) {
            Double tmpData=(Xvalue[i]-Checkjaco[i])/Xvalue[i];
            tmpData=Math.abs(tmpData)*100;
        //  System.out.println("tmpData :" +tmpData);
            if (tmpData < 0.01) {
                check = false;
            }
            else check = true;
            Checkjaco[i] = Xvalue[i];

        }
       // logCheck(Checkjaco);
        return check;
    }
    public static void logCheck(Double Checkjaco[]) {
        System.out.println("log Checkjaco");
        for (int i = 0; i < Checkjaco.length; i++) {
            System.out.println("Checkjaco" + i + ":" + Checkjaco[i]);
        }

    }
    public static void logValue(Double Xvalue[]) {
        System.out.println("log");
        for (int i = 0; i < Xvalue.length; i++) {
            System.out.println("X" + i + ":" + Xvalue[i]);
        }

    }

    public static void opreation(Double martix[][], Double Xvalue[], int input, Double Checkjaco[]) {
        Double tmp, value;
        Double tmpXvalue[] = new Double[input];
        for (int i = 0; i < input; i++) {
            tmp = 0.00;
            value = 0.00;
            //    System.out.println("*********************");
            for (int j = 0; j < input + 1; j++) {
                if (i == j) {
                    tmp = martix[i][j];
                } else if (j == input) value += martix[i][j];
                else value -= martix[i][j] * Xvalue[j];
                //       System.out.println("value" + " " + value + " on " + i + " " + j);
            }
            //   System.out.println("value" + " " + value);
            //   System.out.println("tmp" + " " + tmp);
            tmpXvalue[i] = value / tmp;
            //   System.out.println("*********************");
        }
        for (int i = 0; i < Xvalue.length; i++) {
            Xvalue[i] = tmpXvalue[i];
        }
    }
}


