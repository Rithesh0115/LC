class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        int sum=0;
        int count=0;
        hm.put(0,1);
        for(int num:nums){
            sum+=num;

            int need=sum-k;
            if(hm.containsKey(need)){
                count+=hm.get(need);
            }

            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}