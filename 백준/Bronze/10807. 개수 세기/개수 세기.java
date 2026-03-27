import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int [] a = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=0; i<num; i++){
            if(a[i]==v){
                cnt += 1;
            }
        }
        System.out.print(cnt);
    }
}