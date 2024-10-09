package Easy;

//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Input: accounts = [[1,5],[7,3],[3,5]]
//Output: 10
public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; ++j) {
                sum += accounts[i][j];
                System.out.println(sum);
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
