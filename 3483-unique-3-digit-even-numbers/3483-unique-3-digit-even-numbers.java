class Solution {
    public int totalNumbers(int[] digits) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=digits.length;
        int[] num=new int[3];

        for(int i=0;i<n;i++){
            if(digits[i]==0)
            continue;
            num[0]=digits[i];
            for(int j=0;j<n;j++){
                if(j==i)
                continue;
                num[1]=digits[j];
                for(int k=0;k<n;k++){
                    if(k==j||k==i)
                    continue;

                    if(digits[k]%2!=0)
                    continue;

                    num[2]=digits[k];
                    int number=100*num[0]+num[1]*10+num[2];

                    if(!ans.contains(number)){
                        ans.add(number);
                    }
                }
            }
        }
        return ans.size();

        
    }
}