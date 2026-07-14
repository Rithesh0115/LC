class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int n=s.length();
        int l=0;
        int max=0;
        for(int r=0;r<n;r++){

            while(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;

            }
            hs.add(s.charAt(r));
            max=Math.max(max,r-l+1);
        }
        return max;


        // int max=0;
        // int left=0;
        // int right=0;
        // while (right<s.length()){
        //     char ch=s.charAt(right);
        //     if(!hs.contains(ch)){
        //         hs.add(ch);
        //         max=Math.max(max,right-left+1);
        //         right++;
        //     }
        //     else {
        //         hs.remove(s.charAt(left));
        //         left++;

        //     }
        // }
        // return max;
    }
}