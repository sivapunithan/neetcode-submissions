class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] resultArr = new int[2 * nums.length];

        for (int i=0; i<nums.length; i++){
            resultArr[i] = nums[i];
            resultArr[nums.length + i] = nums[i];
        }

        return resultArr;
    }
}