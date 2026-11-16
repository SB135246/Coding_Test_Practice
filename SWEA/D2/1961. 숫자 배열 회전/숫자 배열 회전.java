
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        for(int t=1; t<=T; t++) {
        	int N = sc.nextInt();
        	int [][] arr = new int [N][N];
        	
        	int [][] arr1 = new int [N][N];
        	int [][] arr2 = new int [N][N];
        	int [][] arr3 = new int [N][N];
        	
        	for(int i=0; i<N; i++) {
        		for(int j=0; j<N; j++)
        			arr[i][j] = sc.nextInt();
        	}
        	//90
        	for(int i=0; i<N; i++) {
        		for(int j=0; j<N; j++)
        			arr1[i][j] = arr[N-j-1][i];
        	}
        	//180
        	for(int i=0; i<N; i++) {
        		for(int j=0; j<N; j++)
        			arr2[i][j] = arr[N-i-1][N-j-1];
        	}
        	//270
        	for(int i=0; i<N; i++) {
        		for(int j=0; j<N; j++)
        			arr3[i][j] = arr[j][N-i-1];
        	}
        	
        	System.out.println("#"+t);
        	for(int i=0; i<N; i++) {
        		for(int j=0; j<N; j++) {
        			System.out.print(arr1[i][j]);
        		}
        		System.out.print(" ");
        		for(int j=0; j<N; j++) {
        			System.out.print(arr2[i][j]);
        		}
        		System.out.print(" ");
        		for(int j=0; j<N; j++) {
        			System.out.print(arr3[i][j]);
        		}
        		System.out.println();

        	}	
        	
     }
    }
}

