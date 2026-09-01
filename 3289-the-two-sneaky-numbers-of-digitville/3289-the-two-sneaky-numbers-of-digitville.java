class Solution {
    public int[] getSneakyNumbers(int[] nums) 
    {
     int[] ans=new int[2];
     HashMap<Integer,Integer> hm=new HashMap<>();
     int count=0;

     for(int i:nums){
       hm.put(i,hm.getOrDefault(i,0)+1);
     }
     for(int i:hm.keySet()){
        if(hm.get(i)==2){
            ans[count++]=i;
        }
     }
     return ans;    
    }
}