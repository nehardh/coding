package codeforces;

import java.util.*;

public class WayTooLongWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String str = sc.next();
            if(str.length() > 10) {
                StringBuilder s = new StringBuilder();
                s.append(str.charAt(0));
                s.append(str.length()-2);
                s.append(str.charAt(str.length()-1));
                System.out.println(s.toString());
            } else {
                System.out.println(str);
            }
        }

    }
}
