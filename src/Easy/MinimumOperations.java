package Easy;


//Input: nums = [1,2,3,4]   Output: 3
//Input: nums = [3,6,9]     Output: 0
public class MinimumOperations {
    public static int minimumOperations(int[] array) {
        int operations = 0;

        for (int i = 0; i < array.length; ++i) {
            if (array[i] % 3 != 0) {
                operations++;
            }
        }

        return operations;
    }
}
