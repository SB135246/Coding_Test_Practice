import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int result = 0;
			int[] arr = new int[10];
			for(int j=0; j<10; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				if(arr[j]%2 != 0)
					result += arr[j];
			}
			System.out.println("#"+(i+1)+" "+result);
		}
	}
}