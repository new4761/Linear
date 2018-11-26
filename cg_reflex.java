
import java.util.Scanner;

public class cg_reflex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("How Many of P :");
        int input = sc.nextInt();
        Double Point[][] = new Double[input][3];
        for (int i = 0; i < input; i++) {
            System.out.println(" P :" + (i + 1));

            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("Value of X :");
                    Point[i][j] = sc.nextDouble();
                } else if(j==1) {
                    System.out.print("Value of Y :");
                    Point[i][j] = sc.nextDouble();
                }
                else  Point[i][j]=1.0;

            }
        }
        cg_reflex(Point, input);
        ShowP(Point, input);
    }
    public static void ShowP(Double Point[][], int input) {
        System.out.println("*******");
        for (int i = 0; i < input; i++) {
            System.out.println("P :" + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.print(Point[i][j] + " ");

            }
            System.out.println(" ");
        }
    }
    public static void cg_reflex(Double Point[][], int input) {
        Double tmpData=0.00;
        Double Reflex[][]=new Double[3][3];
        System.out.println("Insert reflex matrix");
        System.out.println("*********************");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
         System.out.print("Value of " + i + " " + j);
         Reflex[i][j]=sc.nextDouble();
            }
        }
        System.out.println("*********************");
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < 2; j++) {
                tmpData=0.00;
                for (int k = 0; k < 3; k++) {
                    if(Reflex[j][k]==0){}
                    else
                    tmpData+=Point[i][j]*Reflex[j][k];
                    //System.out.println("tmpData:"+tmpData);
                }
                Point[i][j] = tmpData;
            }
        }
    }
}