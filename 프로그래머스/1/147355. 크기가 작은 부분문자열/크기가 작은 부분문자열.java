class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long ex = 0;
        long a = 0;
        for(int i=0; i<=t.length()-p.length(); i++){
            a = Long.parseLong(p);
            ex = Long.parseLong(t.substring(i,i+p.length()));
            if(ex <= a)
                answer ++;
        }
        
        
        
        
        
        return answer;
    }
}
//10203         15    
//   5           2
// 3141592        271
// 7               3