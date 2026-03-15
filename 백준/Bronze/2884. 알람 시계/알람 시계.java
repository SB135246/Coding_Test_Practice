import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b>=45){
            System.out.print(a);
            System.out.print(" ");
            System.out.print(b-45);
        }
        else if(b<45 && a>0){
            int ex = 45-b;
            b = 60-ex;
            a = a-1;
            System.out.print(a);
            System.out.print(" ");
            System.out.print(b);
        }
        else{
            int ex = 45-b;
            b = 60-ex;
            a = 23;

            System.out.print(a);
            System.out.print(" ");
            System.out.print(b);
        }

    }
}
