
import java.util.Scanner;
import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[1001];
        A[0] = 1;
        A[1] = 1;

        for (int i = 2; i <= 1000; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int k = 1; k <= i / 2; k++) {
                int num = 2 * A[i-k] - A[i-2*k];
                set.add(num);
            }

            int candidate = 1;

            while (set.contains(candidate)) {
                candidate++;
            }

            A[i] = candidate;
        }

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            System.out.println(A[n]);
        }

        sc.close();
    }
}
