class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        n=n/3;

        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>n){
                ans.add(entry.getKey());
            }
        }
        return ans;
        
    }
}