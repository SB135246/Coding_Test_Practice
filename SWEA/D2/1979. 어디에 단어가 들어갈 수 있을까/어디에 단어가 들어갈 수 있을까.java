
import java.io.*;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][N];

            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());

                for(int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;

            // 1. 가로 검사
            for(int i = 0; i < N; i++) {
                for(int j = 0; j <= N-K; j++) {

                    boolean check = true;

                    // K칸이 모두 1인지 검사
                    for(int l = j; l < j+K; l++) {
                        if(arr[i][l] == 0) {
                            check = false;
                            break;
                        }
                    }

                    // 앞뒤에 1이 붙어 있는지 검사
                    if(check && (j == 0 || arr[i][j-1] == 0)
                              && (j+K == N || arr[i][j+K] == 0)) {
                        count++;
                    }
                }
            }

            // 2. 세로 검사
            for(int i = 0; i <= N-K; i++) {
                for(int j = 0; j < N; j++) {

                    boolean check = true;

                    // K칸이 모두 1인지 검사
                    for(int l = i; l < i+K; l++) {
                        if(arr[l][j] == 0) {
                            check = false;
                            break;
                        }
                    }

                    // 위아래에 1이 붙어 있는지 검사
                    if(check && (i == 0 || arr[i-1][j] == 0)
                              && (i+K == N || arr[i+K][j] == 0)) {
                        count++;
                    }
                }
            }

            System.out.println("#" + t + " " + count);
        }
    }
}
