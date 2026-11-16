
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int[][] arr = new int[9][9];

            // 스도쿠 입력
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            boolean valid = true;

            // 1. 행 검사
            for (int i = 0; i < 9; i++) {
                boolean[] visited = new boolean[10];

                for (int j = 0; j < 9; j++) {
                    int num = arr[i][j];

                    if (visited[num]) {
                        valid = false;
                        break;
                    }

                    visited[num] = true;
                }
            }

            // 2. 열 검사
            for (int i = 0; i < 9; i++) {
                boolean[] visited = new boolean[10];

                for (int j = 0; j < 9; j++) {
                    int num = arr[j][i];

                    if (visited[num]) {
                        valid = false;
                        break;
                    }

                    visited[num] = true;
                }
            }

            // 3. 3×3 영역 검사
            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {

                    boolean[] visited = new boolean[10];

                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {

                            int num = arr[i + k][j + l];

                            if (visited[num]) {
                                valid = false;
                                break;
                            }

                            visited[num] = true;
                        }
                    }
                }
            }
            int result = 0;
            if(valid) {
            	result = 1;
            }

            System.out.println("#" + t + " " + result);
        }

        sc.close();
    }
}
