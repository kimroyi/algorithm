class Solution {
    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        
        return gcd(b, a % b);
    }
    
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int top = 0;
        int bottom = 0;
        int gcd = 0;

        top = (denum1 * num2) + (denum2 * num1);
        bottom = num1 * num2;
        
        gcd = gcd(top, bottom);

        answer[0] = top/gcd;
        answer[1] = bottom/gcd;
        
        return answer;
    }
}