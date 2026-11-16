
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        for(int t=1; t<=T; t++) {
        	int money = sc.nextInt();
        	
        	int m50000 = 0;
        	int m10000 = 0;
        	int m5000 = 0;
        	int m1000 = 0;
        	int m500 = 0;
        	int m100 = 0;
        	int m50 = 0;
        	int m10 = 0;
        	
        	m50000 = money/50000;
        	money = money%50000;
        	
        	m10000 = money/10000;
        	money = money%10000;
        	
        	m5000 = money/5000;
        	money = money%5000;
        	
        	m1000 = money/1000;
        	money = money%1000;
        	
        	m500 = money/500;
        	money = money%500;
        	
        	m100 = money/100;
        	money = money%100;
        	
        	m50 = money/50;
        	money = money%50;
        	
        	m10 = money/10;
        	money = money%10;

        	System.out.println("#" + t);
        	System.out.println(m50000 + " " +m10000 + " " 
        	+m5000 + " " +m1000 + " " +m500 + " " +m100 + " " +m50 + " " +m10);
        }
        
    }
}
