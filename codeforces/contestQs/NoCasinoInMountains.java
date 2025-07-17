package contestQs;

import java.util.*;

public class NoCasinoInMountains {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int a[] = new int[n];
            int cnt=0;

            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }

            int i=0;
            while(i<=n-k) {
                boolean c=true;
                for(int j=0; j<k; j++) {
                    if(a[i+j] == 1) {
                        c=false;
                        break;
                    }
                }
                if(c) {
                    cnt++;
                    i = i+k;
                } else {
                    i++;
                }
            }
            System.out.println(cnt);
        }
    }
}
