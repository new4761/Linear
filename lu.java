package work.Linear;

import java.util.Scanner;

public class lu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many of X :");
        int input = sc.nextInt();
        Double martix[][] = new Double[input][input + 1];
        //  Double martix[][] = new Double[input][input];
        Double L[][] = new Double[input][input];
        Double U[][] = new Double[input][input];
        for (int i = 0; i < input; i++) {
              for (int j = 0; j < input + 1; j++) {
         //   for (int j = 0; j < input; j++) {
                System.out.print("Value of " + i + " " + j);
                martix[i][j] = sc.nextDouble();
            }

        }
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {

                if (i == j) {
                    L[i][j] = 1.00;
                    U[i][j] = opreation(L, U, i, j, martix);
                    //     testprint(input,L,U,martix);

                } else if (i < j) {

                    L[i][j] = 0.00;

                    U[i][j] = opreation(L, U, i, j, martix);
                    //   testprint(input,L,U,martix);
                } else {

                    U[i][j] = 0.00;
                    L[i][j] = opreation(L, U, i, j, martix);
                    //     testprint(input,L,U,martix);
                }

            }
        }
        LZ(input, martix, L);
        UX(input, martix, U);
       Printmartix(input,L, U, martix);
    }
    public static void Printmartix(int input, Double L[][], Double U[][], Double martix[][]) {
        System.out.println("Printmartix");
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input+1; j++) {
                if(j==input)  System.out.print(":");
                System.out.print(martix[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static void testprint(int input, Double L[][], Double U[][], Double martix[][]) {
        System.out.println("L");
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print(L[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("U");
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print(U[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double opreation(Double L[][], Double U[][], int i, int j, Double martix[][]) {
        Double value = 0.00;

        if (i == 0) {
            value = martix[i][j];
        } else if (j == 0) {
            value = martix[i][j] / U[0][0];
        } else {
            if (i <= j) {
                for (int d = 0; d < i; d++) {
                    value += (L[i][d] * U[d][j]);
                }
                value = (martix[i][j] - value);
            } else if (i > j) {
                for (int d = 0; d < j; d++) {
                    value += (L[i][d] * U[d][j]);
                }
                value = (martix[i][j] - value) / U[j][j];
            }


        }
        return value;
    }

    public static void LZ(int input, Double martix[][], Double L[][]) {
        double stat=0;
        for (int i = 0; i < input; i++) {
            stat=0;
            for (int j = 0; j < i; j++) {
                stat+=L[i][j]*martix[j][input];
            }
            martix[i][input]-=stat;
        }
    }
    public static void UX(int input, Double martix[][], Double U[][]) {
        double stat=0;
        for (int i = input-1; i >= 0; i--) {
            stat=0;
            for (int j = input-1; j > i; j--) {
                stat+=U[i][j]* martix[j][input];
            }
            martix[i][input]=(martix[i][input]-stat)/U[i][i];
        }
    }

}
