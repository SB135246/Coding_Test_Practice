
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t = 1; t <= T; t++) {
            int N = sc.nextInt();

            int p = 1;
            boolean flag = false;

            boolean[] result = new boolean[10];

            while(!flag) {
                long i = (long) N * p;
                long temp = i;

                while(temp > 0) {
                    int digit = (int)(temp % 10);
                    temp /= 10;

                    result[digit] = true;
                }

                flag = true;

                for(int j = 0; j < 10; j++) {
                    if(!result[j]) {
                        flag = false;
                        break;
                    }
                }

                p++;
            }

            System.out.println("#" + t + " " + (long)N * (p - 1));
        }

        sc.close();
    }
}
