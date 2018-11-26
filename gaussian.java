package work.Linear;

import java.util.*;

public class gaussian {
    static Scanner sc = new Scanner(System.in);
    static int x;

    public static void main(String[] args) {

        System.out.println("How Many X?");

        System.out.print("X = ");
        x = sc.nextInt();
        int X[] = new int[x];
        double maxtrix[][] = new double[x][x + 1];
        for (int i = 0; i < x; i++) {
            System.out.println("Inset your " + (i + 1) + " equation");
            System.out.println("-----------------------------");
            for (int j = 0; j < x + 1; j++) {
                //      System.out.println(j);
                System.out.println("Inset your Number " + (j + 1) + " on " + (i + 1) + " equation");
                System.out.print("You Number : ");

                maxtrix[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.println();
            for (int j = 0; j < x + 1; j++) {
                if (j == (x)) {
                    System.out.print(":" + maxtrix[i][j]);
                } else
                    System.out.print(maxtrix[i][j] + " ");
            }
        }
        System.out.println("\n" + "before");
        for (int i = 1; i < x; i++) {
            for (int j = 0; j < i; j++) {
                double num = maxtrix[i][j];
                double tem = maxtrix[j][j];
                for (int k = 0; k < x + 1; k++) {

                    maxtrix[i][k] -= (maxtrix[j][k] * num / tem);
                }
                for (int k = 0; k < x; k++) {
                    System.out.println();
                    for (int s = 0; s < x + 1; s++) {
                        if (s == (x)) {
                            System.out.print(":" + maxtrix[k][s]);
                        } else
                            System.out.print(maxtrix[k][s] + " ");
                    }

                }
                System.out.println(" ****step*** ");
            }

        }
        System.out.println("\n"+"***done****");
        for (int i = 0; i < x; i++) {
            System.out.println();
            for (int j = 0; j < x + 1; j++) {
                if (j == (x)) {
                    System.out.print(":" + maxtrix[i][j]);
                } else
                    System.out.print(maxtrix[i][j] + " ");
            }

        }
        X[x-1]=-1;
        for(int i=x-1;i>-1;i--){
           // System.out.println("\n run:"+i);
            X[i]=run(i,maxtrix,X);

        }
        System.out.println("\n"+"result");
        for (int i=0;i<x;i++)
         {
            System.out.print("X"+(i+1)+":"+X[i] + " ");

        }

    }

    static public int run(int d, double array[][],int X[]) {
        double stat = 0;

        for(int i=d;i<x;i++) {
            double count=0;
                    if(i!=d){
                     //   System.out.println(X[i]+" on "+i+" X ");
                        count = array[d][i] *X[i];
                     //   System.out.println(stat+" [ - ] "+count);
                        stat= stat-count;

                    }
        }
        int i =(int)  (( array[d][x] + ( stat)) /  array[d][d]);
     //   System.out.println(i+" on "+d+" Max:"+array[d][x]+" stat:"+stat+" / "+(int) array[d][d]);
        return i;
    }

}



