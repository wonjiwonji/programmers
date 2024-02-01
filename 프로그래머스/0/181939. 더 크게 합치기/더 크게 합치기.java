class Solution {
    public int solution(int a, int b) {
        String r1 = ""+a+b;
        String r2 = ""+b+a;
        int ab = Integer.parseInt(r1);
        int ba = Integer.parseInt(r2);
        if(ab>ba) {
            return ab;
        } else {
            return ba;
        }
        
    }
}