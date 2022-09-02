class Solution {
    public int subarraySum(int[] nums, int k) {
        int a=k;
        int count=0;
        for (int i=0;i<nums.length;i++){
            a=k;
            for(int j=i;j<nums.length;j++){
                a=a-nums[j];
                if (a==0){
                    count++;
                }
            }
        }
        return count;
    }
}