
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for(int t = 1; t <= 10; t++) {
            int N = sc.nextInt();
            int[] arr = new int[8];
            for(int i=0; i<8; i++) {
            	arr[i] = sc.nextInt();
            }
            int i=1;
            while(arr[7] != 0) {
            	arr[0] = arr[0] - i;
            	if(arr[0] <=0) {
            		arr[0] = 0;
            	}
            	int temp = arr[0];
            	for(int j=1; j<8; j++) {
            		arr[j-1] = arr[j];
            	}
            	arr[7] = temp;
            	i = i+1;
            	if(i>5)
            		i = 1;
            }
            
            
            
            
            System.out.print("#" + N + " ");
            for(int k=0; k<8; k++) {
            	System.out.print(arr[k] + " ");
            }
            System.out.println();
            
        }

        sc.close();
    }
}
