
import java.util.Scanner;

public class cg_rotate
{
    static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            //System.out.print(  Math.cos(Math.toRadians(30)));

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
            rotate(Point, input);
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
        public static void rotate(Double Point[][], int input) {
            int rotate;
            Double tmpData=0.00;
            System.out.println("rotate  :");
            rotate=sc.nextInt();
            Double Rotate[][]={ {Math.cos(Math.toRadians(rotate)),Math.sin(Math.toRadians(rotate))*-1},
                                {Math.sin(Math.toRadians(rotate)),Math.cos(Math.toRadians(rotate))}
            };

            for (int i = 0; i < input; i++) {
                for (int j = 0; j < 2; j++) {
                    tmpData=0.0;
                    for (int k = 0; k < 2; k++) {
                        tmpData+=Point[i][j]*Rotate[j][k];

                    }
                   Point[i][j] = tmpData;
                }
            }
        }
}