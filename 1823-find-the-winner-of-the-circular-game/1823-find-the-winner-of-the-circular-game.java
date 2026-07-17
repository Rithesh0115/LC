class Solution {
    public int findTheWinner(int n, int k) {
        int win=0;
        for(int i=2;i<=n;i++){
            win=(win+k)%i;
        }
        return win+1;
        //   Queue<Integer> q = new LinkedList<>();

        // for(int i=1;i<=n;i++){
        //     q.offer(i);
        // } 
        // while(q.size()>1){
        //     for(int i=0;i<k-1;i++){
        //         q.offer(q.poll());
        //     }
        //     q.poll();
        // }
        // return q.peek();
    }
}