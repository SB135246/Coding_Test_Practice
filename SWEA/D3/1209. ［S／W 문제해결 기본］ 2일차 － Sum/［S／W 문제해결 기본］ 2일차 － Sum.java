
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for(int t=1; t<=10; t++) {
        	int N = sc.nextInt(); 
        	int[][]arr = new int[100][100];
        	for(int i=0; i<100; i++) {
        		for(int j=0; j<100; j++) {
        			arr[i][j] = sc.nextInt();
        		}
        	}
        	
        	//행
        	int maxh = 0;
        	for(int i=0; i<100; i++) {
        		int sum = 0;
        		for(int j=0; j<100; j++) {
        			sum+=arr[i][j];
        		}
        		maxh = Math.max(maxh, sum);
        	}
        	//열
        	int maxc = 0;
        	for(int i=0; i<100; i++) {
        		int sum = 0;
        		for(int j=0; j<100; j++) {
        			sum+=arr[j][i];
        		}
        		maxc = Math.max(maxc, sum);
        	}
        	//왼쪽 대각선
        	int maxd1 = 0;
        	for(int i=0; i<100; i++) {
        		maxd1+=arr[i][i];
        	}
        	
        	//오른쪽 대각선
        	int maxd2 = 0;
        	for(int i=0; i<100; i++) {
        		maxd2 += arr[i][99-i];
        	}
        	
        	int max = 0;
        	max = Math.max(max, maxh);
        	max = Math.max(max, maxc);
        	max = Math.max(max, maxd1);
        	max = Math.max(max, maxd2);
        	
        	
        	
        	
        	
        System.out.println("#" + N + " "+ max);	
        }
        sc.close();
    }
}
