class Solution {
    public int climbStairs(int n) {
        int one=1;
        int two=2;
        int total=0;
        if(n<=2){return n;}
        for(int i=3;i<=n;i++){
            total=one+two;
            one=two;
            two=total;
        }return total;
        
    }
}
