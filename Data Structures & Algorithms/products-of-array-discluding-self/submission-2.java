class Solution {
    public int[] productExceptSelf(int[] nums) {

        int prod = 1;
        int zeroCount = 0;

        for(int num : nums){
            if(num == 0){
                zeroCount++;
            } else {
                prod *= num;
            }
        }

        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){

            if(zeroCount > 1){
                result[i] = 0;
            }
            else if(zeroCount == 1){
                result[i] = nums[i] == 0 ? prod : 0;
            }
            else{
                result[i] = prod / nums[i];
            }
        }

        return result;
    }
}