import java.io.*;
import java.util.StringTokenizer;
class Solution {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=1; t<=T; t++) {
        	int[] arr = new int[10];
        	int max = 0;
        	int min = 10000;
        	int col = 0;
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int i=0; i<10; i++) {
        		arr[i] = Integer.parseInt(st.nextToken());
        		max = Math.max(max, arr[i]);
        		min = Math.min(min, arr[i]);
        		col += arr[i];
        	}
        	col = col - max - min;
        	int result = (int)Math.round(col/8.0);
        	
        	System.out.println("#" + t + " " + result);
        	
        }
    }
}




