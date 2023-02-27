class Solution {
    public int tribonacci(int n) {
          int T0=0;
        int T1=1;
        int T2=1;
    if( n ==0) return 0;
        int sum =1;
        for (int i = 2; i <n; i++) {
            sum = T1 +T2+T0;
            T0=T1;
            T1=T2;
            T2=sum;
        }
        return sum;
    }
}