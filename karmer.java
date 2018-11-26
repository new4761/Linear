package work.Linear;
import  java.util.*;
public class karmer {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("How Many of X :");
        int input = sc.nextInt();
        Double martix [][]  = new Double[input][input+1] ;
        for(int i=0;i<input;i++){
            for (int j=0;j<input+1;j++){
                martix[i][j]=sc.nextDouble();
            }


        }
    }
}
