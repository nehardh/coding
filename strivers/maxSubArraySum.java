package strivers;
import java.util.*;

public class maxSubArraySum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        long max_Sum = Long.MIN_VALUE;
        long s=0;

        for(int i=0; i<n; i++) {
            s += a[i];
            if(s>max_Sum) max_Sum=s;
            if(s<0) s=0;
        }
        System.out.println(max_Sum);
    }
}
