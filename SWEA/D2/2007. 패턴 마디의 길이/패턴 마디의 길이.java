import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String str = br.readLine();
			int madi = 0;
			for(int j=1; j<str.length(); j++) {
				String a = str.substring(0,j);
				String b = str.substring(j, j*2);
				if(a.equals(b)) {
					madi = j;
					break;
				}
			}
			System.out.println("#"+(i+1)+" "+ madi);
		}
	}
}