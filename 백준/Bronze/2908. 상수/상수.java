import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        String ra = new StringBuilder(a).reverse().toString();
        String rb = new StringBuilder(b).reverse().toString();

        int A = Integer.parseInt(ra);
        int B = Integer.parseInt(rb);

        System.out.println(Math.max(A,B));



    }
}