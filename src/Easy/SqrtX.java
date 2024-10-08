package Easy;

public class SqrtX {
    public int mySqrt(int x) {
        long high = x;
        long low = 0;

        while(low <= high){
            long mid = (high + low) / 2;
            if((mid * mid) == x) {
                return (int)mid;
            }
            else if ((mid * mid) > x) {
                high = mid-1;
            }
            else low = mid + 1;
        }
        return (int)high;
    }
}