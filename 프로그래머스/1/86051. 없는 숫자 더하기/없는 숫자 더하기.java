class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for (int j = 0; j < 10; j++) {
            boolean found = false;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == j) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                answer += j;
            }
        }

        return answer;
    }
}