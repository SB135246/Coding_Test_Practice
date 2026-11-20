
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for(int t=1; t<=10; t++) {
        	int N = sc.nextInt(); //덤프횟수
        	int[] arr = new int[100];
        	for(int i=0; i<100; i++) {
        		arr[i] = sc.nextInt();
        	}
        	
        	
        	int result = 0;
        	for(int i=0; i<N; i++) {
        		int max = 0;
        		int min = 101;
        		int maxIndex = 0;
        		int minIndex = 0;
        		for(int j=0; j<100; j++) {
        			if(max<arr[j]) {
        				max = arr[j];
        				maxIndex = j;
        			}
        			if(min>arr[j]) {
        				min = arr[j];
        				minIndex = j;
        			}
        		}
        		arr[maxIndex]--;
        		arr[minIndex]++;
        	}
        	int max = 0;
        	int min = 101;
        	for(int i=0; i<100; i++) {
        		max = Math.max(max, arr[i]);
        		min = Math.min(min, arr[i]);
        	}
        	
        	result = max-min;
        	
        	
        	
        	System.out.println("#"+t+" "+result);
        }
        sc.close();
    }
}
