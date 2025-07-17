package contestQs;
import java.util.*;

public class OnlyOneDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String nums = Integer.toString(n);
            int d[] = new int[nums.length()];

            int min=9;
            for(int i=0; i<nums.length(); i++) {
                d[i] = nums.charAt(i)-'0';
                if(d[i] < min) min = d[i];
            }
            System.out.println(min+" ");
        }
    }
}
