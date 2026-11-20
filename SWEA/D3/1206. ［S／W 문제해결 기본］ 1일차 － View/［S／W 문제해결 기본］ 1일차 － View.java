
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for(int t=1; t<=10; t++) {
        	int N = sc.nextInt();
        	int[] arr = new int[N];
        	for(int i=0; i<N; i++) {
        		arr[i] = sc.nextInt();
        	}
        	int count = 0;
        	for(int i=2; i<N-2; i++) {
        		int maxa = 0;
        		int maxb = 0;
        		int max = 0;
        		maxa = Math.max(arr[i-1], arr[i-2]);
        		maxb = Math.max(arr[i+1], arr[i+2]);
        		max = Math.max(maxa, maxb);
        		
        		if(arr[i] <= max) {
        			continue;
        		}else {
        			count+=arr[i]-max;
        		}
        	}
        	System.out.println("#" + t + " " + count);
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }
        sc.close();
    }
}
