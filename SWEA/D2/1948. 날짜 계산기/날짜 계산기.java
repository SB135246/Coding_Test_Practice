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
        		System.out.println("#" + t + " " + result);
        	}else {
        	
        		result += d2+1;
        		
        		int[] month = new int[m2-m1-1];
        		
        		int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        	    result += arr[m1-1] - d1;
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		for(int i=0; i<m2-m1-1; i++) {
        			month[i] = m1+1+i;
        			result += arr[month[i]-1];
        			
        			
        			
        			
        		}
        		System.out.println("#" + t + " " + result);
        	}
        }
        sc.close();
    }
}
