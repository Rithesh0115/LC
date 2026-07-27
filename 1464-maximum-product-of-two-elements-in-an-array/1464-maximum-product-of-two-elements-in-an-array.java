class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int smax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                smax=max;
                max=nums[i];

            }else if(nums[i]==max){
                smax=max;
                max=nums[i];
            }
        }
        return (smax-1)*(max-1);

        
    }
}