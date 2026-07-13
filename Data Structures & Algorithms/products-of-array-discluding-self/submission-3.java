class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prodLeft = 1;
        int prodRight = 1;
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            leftProd[i] = prodLeft;
            prodLeft = prodLeft * nums[i];
            rightProd[nums.length-i-1] = prodRight;
            prodRight = prodRight * nums[nums.length-i-1];
        }

        int[] result = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            result[i] = leftProd[i] * rightProd[i];
        }
        return result;
    }
}  
