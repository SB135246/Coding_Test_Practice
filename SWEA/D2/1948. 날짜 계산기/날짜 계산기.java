import java.util.*;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        for(int t=1; t<=T; t++) {
        	int m1 = sc.nextInt();
        	int d1 = sc.nextInt();
        	int m2 = sc.nextInt();
        	int d2 = sc.nextInt();
        	
        	int result = 0;
        	if(m1 == m2) {
        		result = d2-d1+1;
        	}else {
        	
        		result += d2+1;
        		
        		int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        	    result += arr[m1-1] - d1;

        		for(int i=m1+1; i<m2; i++) {
        			result+=arr[i-1];
        		}
        	}
    		System.out.println("#" + t + " " + result);
        }
        sc.close();
    }
}
