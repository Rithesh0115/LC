class Solution {
    public int[] resultArray(int[] nums) 
    {
     int[] arr1=new int[nums.length];
     int[] arr2=new int[nums.length];
     int in1= 1;
     int in2=1;
     arr1[0]=nums[0];
     arr2[0]=nums[1];   
     for(int i=2;i<nums.length;i++){
        if(arr1[in1-1]>arr2[in2-1]){
             arr1[in1]=nums[i];
             in1++;
        }else{
             arr2[in2]=nums[i];
             in2++;
        }
     }
     for(int i=0;i<in2;i++){
        arr1[in1++]=arr2[i];
     }
     return arr1;
    }
}