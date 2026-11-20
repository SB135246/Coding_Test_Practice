
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t = 1; t <= T; t++) {
        	int N = sc.nextInt();
        	int[] arr = new int[101];
        	int max = 0;
        	int answer = 0;
            for(int i=0; i<1000; i++) {
            	int num = sc.nextInt();
            	arr[num]++;
            	if(arr[num]>max || (arr[num]==max&&num>answer)) {
            		max = arr[num];
            		answer = num;
            	}
            }
            
            System.out.println("#" + N + " " + answer);
            
            
            
        }

        sc.close();
    }
}
