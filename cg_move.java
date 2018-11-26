
import java.util.Scanner;

public class cg_move {
static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("How Many of P :");
        int input = sc.nextInt();
        Double Point[][] = new Double[input][2];
        for (int i = 0; i < input; i++) {
            System.out.println(" P :" + (i + 1));

            for (int j = 0; j < input + 1; j++) {
            if(j==0) {
                System.out.print("Value of X :");
                Point[i][j] = sc.nextDouble();
            }
            else  {
                System.out.print("Value of Y :");
                Point[i][j] = sc.nextDouble();
            }
            }
        }
        move(Point, input);
        ShowP(Point, input);

    }

    public static void ShowP(Double Point[][], int input) {
        System.out.println("log");
        for (int i = 0; i < input; i++) {
            System.out.println("P :" + (i + 1));

            for (int j = 0; j < 2; j++) {
                System.out.print(Point[i][j] + " ");

            }
        }
    }
    public static void move(Double Point[][], int input) {
        for (int i = 0; i < input; i++) {
            System.out.println("MOVE ON P :" + (i + 1));

            for (int j = 0; j < 2; j++) {
                if(j==0) {
                    System.out.print("MOVE of X :");
                    Point[i][j] += sc.nextDouble();
                }
                else  {
                    System.out.print("MOVE of Y :");
                    Point[i][j] += sc.nextDouble();
                }
            }
        }
    }
}
