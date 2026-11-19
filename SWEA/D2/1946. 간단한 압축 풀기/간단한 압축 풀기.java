
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t=1; t<=T; t++) {
            int N = sc.nextInt();

            System.out.println("#" + t);

            int count = 0;

            for(int i=0; i<N; i++) {
                String str = sc.next();
                int num = sc.nextInt();

                for(int j=0; j<num; j++) {
                    System.out.print(str);
                    count++;

                    if(count == 10) {
                        System.out.println();
                        count = 0;
                    }
                }
            }

            if(count != 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}
