import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		
		
		
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			long profit = 0;
			int max = arr[N-1];
			for(int j=N-1; j>=0; j--) {
				if(max > arr[j]) {
					profit = profit + (max - arr[j]);
				}
				else {
					max = arr[j];
				}
			}
			System.out.println("#"+(i+1)+" "+profit);
		}
	}
}