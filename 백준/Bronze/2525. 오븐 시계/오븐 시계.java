import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int time = a * 60 + b;
        time +=c;

        time%=(24*60);
        System.out.println(time/60+" "+time%60);
    }
}
