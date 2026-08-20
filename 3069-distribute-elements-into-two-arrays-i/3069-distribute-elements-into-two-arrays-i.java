class Solution {
    public int[] resultArray(int[] nums) 
    {
     int[] arr1=new int[nums.length];
     int[] arr2=new int[nums.length];
     int index1 = 1;
     int index2 = 1;
     arr1[0]=nums[0];
     arr2[0]=nums[1];   
     for(int i=2;i<nums.length;i++){
        if(arr1[index1-1]>arr2[index2-1]){
             arr1[index1]=nums[i];
             index1++;

        }else{
             arr2[index2]=nums[i];
             index2++;
        }
     }
     int[] result=new int[nums.length];
     int k=0;
     for(int i=0;i<index1;i++){
        result[k++]=arr1[i];
    }
    for(int i=0;i<index2;i++){
        result[k++]=arr2[i];
    }
    return result;

    }
}