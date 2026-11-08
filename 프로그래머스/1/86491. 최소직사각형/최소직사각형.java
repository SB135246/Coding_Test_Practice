class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int min = 0;
        int maxWidth = 0;
        int maxHeight = 0;
        for(int i=0; i<sizes.length; i++){
            max = Math.max(sizes[i][0], sizes[i][1]);
            min = Math.min(sizes[i][0], sizes[i][1]);
            maxWidth = Math.max(maxWidth, max);
            maxHeight = Math.max(maxHeight, min);
        }
        
        answer = maxWidth * maxHeight;
        
        
        
        
        return answer;
    }
}