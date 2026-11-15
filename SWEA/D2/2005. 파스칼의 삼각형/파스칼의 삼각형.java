import java.io.*;
class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());

            int[][] arr = new int[N][N];

            System.out.println("#" + t);

            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    }

                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
