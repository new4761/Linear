package work;

import java.util.Scanner;

public class cg_size {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("How Many of P :");
        int input = sc.nextInt();
        Double Point[][] = new Double[input][2];
        for (int i = 0; i < input; i++) {
            System.out.println(" P :" + (i + 1));

            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print("Value of X :");
                    Point[i][j] = sc.nextDouble();
                } else {
                    System.out.print("Value of Y :");
                    Point[i][j] = sc.nextDouble();
                }
            }
        }
        Resize(Point, input);
        ShowP(Point, input);

    }

    public static void ShowP(Double Point[][], int input) {
        System.out.println("*******");
        for (int i = 0; i < input; i++) {
            System.out.println("P :" + (i + 1));

            for (int j = 0; j < 2; j++) {
                System.out.print(Point[i][j] + " ");

            }
            System.out.println(" ");
        }
    }

    public static void Resize(Double Point[][], int input) {
        Double resize[][] = {{0.00, 0.00}, {0.00, 0.00}};
        Double Center[] = new Double[2];
        System.out.println("Resize  :");
        System.out.print(" X Value :");
        resize[0][0] = sc.nextDouble();
        System.out.print(" Y Value :");
        resize[1][1] = sc.nextDouble();
        for (int i = 0; i < 2; i++) {
            Double tmp = 0.0;
            for (int j = 0; j < input; j++) {
                tmp += Point[j][i];
            }
            Center[i] = tmp / input * -1;
            // System.out.println("Center[i] "+Center[i]);
        }
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < 2; j++) {
                Point[i][j] += Center[j];
            }

        }


        for (int i = 0; i < input; i++) {
            for (int j = 0; j < 2; j++) {
               // ShowP(Point, input);
                for (int k = 0; k < 2; k++) {
                    //System.out.print(" Point[i][j]:"+Point[i][j]);
                   // System.out.print(" resize[j][k]:"+resize[j][k]);
                    if(resize[j][k]==0){}
                    else Point[i][j]*=resize[j][k];

                }

            }
        }
            for (int i = 0; i < input; i++) {
                for (int j = 0; j < 2; j++) {
                    Point[i][j] += (Center[j] * -1);
                }

            }

        }
    }



