
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t=1; t<=T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            double[] score = new double[N];

            for(int i=0; i<N; i++) {
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();

                double sum = a*0.35 + b*0.45 + c*0.2;
                score[i] = sum;
            }

            // K번째 학생의 원래 점수 저장
            double knum = score[K-1];

            // 점수 오름차순 정렬
            Arrays.sort(score);

            // K번째 학생보다 점수가 높은 학생 수
            int count = 0;

            for(int i=0; i<N; i++) {
                if(score[i] > knum) {
                    count++;
                }
            }

            // 등급 배열
            String[] str = {
                "A+", "A0", "A-",
                "B+", "B0", "B-",
                "C+", "C0", "C-",
                "D0"
            };

            // 등급 인덱스 계산
            int index = count / (N/10);

            System.out.println("#" + t + " " + str[index]);
        }

        sc.close();
    }
}
