class Solution {
    public int missingNumber(int[] nums) {
     int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=count){
                return count;
            }
            else{
                count ++;
            }
        }
        return count;
    }
}