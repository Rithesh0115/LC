class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0,s=0;
        int maxcount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }else{
                count=0;
            }
            if(count>maxcount){
                maxcount=count;
            }
            // maxcount=Math.max(count,maxcount);
        }
        return maxcount;
        
    }
}