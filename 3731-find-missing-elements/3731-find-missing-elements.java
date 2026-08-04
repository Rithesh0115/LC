class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int num:nums){
          hs.add(num);
          min=Math.min(min,num);
          max=Math.max(max,num);
        }
       
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=min+1;i<max;i++){
            if(!hs.contains(i)){
                list.add(i);
            }
        }
         return list;
        
    }
}