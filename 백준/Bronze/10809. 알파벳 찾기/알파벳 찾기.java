import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int[] arr = new int[26];

        for(int i = 0; i < 26; i++){
            arr[i] = -1;
        }

        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';

            if(arr[index] == -1){
                arr[index] = i;
            }
        }

        for(int i = 0; i < 26; i++){
            System.out.print(arr[i] + " ");
        }
    }
}