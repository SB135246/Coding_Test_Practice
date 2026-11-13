
import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int count = 0;

            while (Math.max(A, B) <= N) {
                if (A > B) {
                    B += A;
                } else {
                    A += B;
                }

                count++;
            }

            sb.append(count).append('\n');
        }

        System.out.print(sb);
    }
}
