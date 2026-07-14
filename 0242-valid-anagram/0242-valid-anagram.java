class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;

        
        //Using HashMap
        // if(s.length()!=t.length()){
        //   return false;
        // }

        // HashMap<Character,Integer> hm1=new HashMap<>();
        // HashMap<Character,Integer> hm2=new HashMap<>();

        // for(int i=0;i<s.length();i++){
        //     hm1.put(s.charAt(i),hm1.getOrDefault(s.charAt(i),0)+1);
        // }

        // for(int i=0;i<t.length();i++){
        //     hm2.put(t.charAt(i),hm2.getOrDefault(t.charAt(i),0)+1);
        // }
        // return hm1.equals(hm2);
        
        //Using sort
        // char[] a1=s.toCharArray();
        // char[] a2=t.toCharArray();

        // Arrays.sort(a1);
        // Arrays.sort(a2);

        // return Arrays.equals(a1,a2)?true:false;

        
    }
}