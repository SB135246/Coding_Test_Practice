import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Solution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<N+1; i++) {
			String str = String.valueOf(i);
			int count = 0;
			
			for(int j=0; j<str.length(); j++) {
				char c = str.charAt(j);
				
				if(c == '3' || c == '6' || c == '9') {
					count++;
				}
			}
			
			if(count > 0) {
				for(int k=0; k<count; k++) {
					System.out.print("-");
				}
			}
			else {
				System.out.print(i);
			}
			System.out.print(" ");
			
			
			
		}
	}
}