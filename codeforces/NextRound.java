import java.util.*;

public class NextRound {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        int k = sc.nextInt();
        int cnt=0;
        
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int kth=a[k-1];

        for(int i: a) {
            if(i>=kth && i>0) cnt++;
        }
        System.out.println(cnt+" ");
    }
}
