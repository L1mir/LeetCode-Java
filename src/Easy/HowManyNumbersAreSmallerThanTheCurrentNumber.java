package Easy;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int lengthNums = nums.length;
        int[] result = new int[lengthNums];
        for(int i = 0; i < lengthNums; i++){
            int currentNum = nums[i];
            int count = 0;
            for(int j= 0; j < lengthNums; j++){
                if(i == j){
                    continue;
                }else{
                    if(nums[j] < nums[i]){
                        count++;
                    }
                }
            }
            result[i] = count;
        }
        return result;
    }
}
