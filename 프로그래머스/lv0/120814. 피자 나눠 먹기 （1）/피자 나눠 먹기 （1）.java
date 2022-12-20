class Solution {
    public int solution(int n) {
        int answer = 0;
        int remainPiece = (n % 7 >= 1 ? 1 : 0);
        
        if (n < 7) {
            answer = 1;    
        } else {
            answer = (n / 7) + remainPiece;
        }
        
        return answer;
    }
}