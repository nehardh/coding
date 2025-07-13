import java.util.*;

public class beautifulMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[5][5];

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(a[i][j] == 1) {
                    System.out.println(Math.abs(i-2)+ Math.abs(j-2));
                }
            }
        }
    }
}
