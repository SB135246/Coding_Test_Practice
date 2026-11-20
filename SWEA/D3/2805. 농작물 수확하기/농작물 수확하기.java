
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            for(int i = 0; i < N; i++) {
                String str = sc.next();
                for(int j = 0; j < N; j++) {
                    arr[i][j] = str.charAt(j) - '0';
                }
            }

            int center = N / 2;
            int sum = 0;

            for(int i = 0; i < N; i++) {
                int distance = Math.abs(center - i);

                int start = distance;
                int end = N - 1 - distance;

                for(int j = start; j <= end; j++) {
                    sum += arr[i][j];
                }
            }

            System.out.println("#" + t + " " + sum);
        }

        sc.close();
    }
}
