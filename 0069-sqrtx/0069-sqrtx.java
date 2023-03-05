class Solution {
    public int mySqrt(int x) {
    if (x==1|x==2) return 1;
        for (int i = 0; i < x; i++) {
            long times = (long) i *i;
            if (times>x) return i-1;
            else if (times==x) return i;
        }
        return 0;
    }
}