import java.util.Scanner;

public class baek2566 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int gugu[][] = new int[9][9];
        int max = 0;
        int x = 1;
        int y = 1;
        for (int i = 0; i < gugu.length; i++) {
            for (int j = 0; j < gugu.length; j++) {
                gugu[i][j] = sc.nextInt();
                if(max < gugu[i][j]){
                    max =gugu[i][j]; 
                    x = i+1; 
                    y = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.print(x + " "+ y);
    }
}
