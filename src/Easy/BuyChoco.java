package Easy;

import java.util.Arrays;

public class BuyChoco {
//    Input: prices = [1,2,2], money = 3
//    Output: 0
//    Input: prices = [3,2,3], money = 3
//    Output: 3
    public static int buyChoco(int[] prices, int money) {
        int chocoAmount = 0;
        int cantBuy = money;
        Arrays.sort(prices);

        for (int price : prices) {
            money -= price;
            chocoAmount++;
            if (chocoAmount == 2 && money >= 0) return money;
        }

        return cantBuy;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 2};
        int[] prices2 = new int[]{3, 2, 3};
        System.out.println(buyChoco(prices2, 3));
    }
}
