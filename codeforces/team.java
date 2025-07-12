//package codeforces;

import java.util.*;

public class team {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt=0;

        while(n-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if((a==1&&b==1) || (a==1&&c==1) || (b==1&&c==1)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
