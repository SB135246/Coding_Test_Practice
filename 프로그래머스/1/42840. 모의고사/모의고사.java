import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % person1.length])
                score1++;

            if (answers[i] == person2[i % person2.length])
                score2++;

            if (answers[i] == person3[i % person3.length])
                score3++;
        }

        int max = Math.max(score1, Math.max(score2, score3));

        int[] answer = new int[3];
        int count = 0;

        if (score1 == max) {
            answer[count++] = 1;
        }

        if (score2 == max) {
            answer[count++] = 2;
        }

        if (score3 == max) {
            answer[count++] = 3;
        }

        return Arrays.copyOf(answer, count);
    }
}