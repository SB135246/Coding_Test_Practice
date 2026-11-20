import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
    	int T = sc.nextInt();
    	for(int t=1; t<=T; t++) {
    		int N = sc.nextInt();
    		int a = 0;
    		int b = 0;
    		int c = 0;
    		int d = 0;
    		int e = 0;
    		
    		while(N%2==0) {
    			N = N/2;
    			a++;
    		}
    		while(N%3==0) {
    			N = N/3;
    			b++;
    		}
    		
    		while(N%5==0) {
    			N = N/5;
    			c++;
    		}
    		
    		while(N%7==0) {
    			N = N/7;
    			d++;
    		}
    		
    		while(N%11==0) {
    			N = N/11;
    			e++;
    		}
    		
    		System.out.println("#" + t + " " + a + " " + b + " " + c + " " + d + " " + e);
    		
    		
    		
    		
    		
    		
    		
    	}
    }
}
