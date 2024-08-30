package Medium;

public class ReverseInteger {
    public int reverse(int x) {
        var reversed = 0L;
        var digit = 0;

        while (x != 0) {
            digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;

            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int)reversed;
    }
}
