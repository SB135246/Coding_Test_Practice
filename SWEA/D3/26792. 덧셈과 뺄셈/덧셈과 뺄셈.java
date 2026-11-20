
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        for(int t=0; t<TC; t++) {
        	int q = sc.nextInt();
        	int p = sc.nextInt();
        	int A = (q+p)/2;
        	int B = q-A;
        	

        	System.out.println(A + " " + B);
        }
        sc.close();
    }
}
