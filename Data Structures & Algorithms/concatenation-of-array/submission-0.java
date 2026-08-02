class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans = new int[2* nums.length];
        
        for (int i=0; i<nums.length; i++){
            ans[i] = nums[i];
        }

        int lastIdx = nums.length;
        for(int i=0; i<nums.length; i++){
            ans[lastIdx] = nums[i];
            lastIdx++;
        }

        return ans;
    }
}