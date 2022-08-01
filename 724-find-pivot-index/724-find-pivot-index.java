class Solution {
    public int pivotIndex(int[] nums) {
        int lSum=0;
        int total=0;
        for(int x:nums) total+=x;
      
        {
            for(int j=0;j<nums.length;++j)
            {
                if(lSum == total - lSum - nums[j])
                    return j;
                lSum=lSum+nums[j];
            }
            return -1;
        }
    }
}