import java.util.Scanner;

public class baek2738{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] hang = new int[N][M];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                for (int j2 = 0; j2 < M; j2++) {
                    hang[j][j2] += sc.nextInt();                    
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if(i!=0) System.out.println("");
            for (int j = 0; j < M; j++) {
                System.out.print(hang[i][j]+" ");
            }
        }
    }
}