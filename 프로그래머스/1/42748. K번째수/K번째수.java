import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
         //i-1 j-1 copyOfRange로 하고 arrays.sort로 정렬하고 k-1번째 가져오면 됨.
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int[] result = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(result);
            answer[i] = result[((commands[i][2])-1)];
        }
        
        
        
        
        return answer;
    }
}