class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(Integer x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }


PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] -b[1]);
        for(Map.Entry<Integer,Integer> val : map.entrySet()){
            int num = val.getKey();
            int entry = val.getValue();

            pq.offer(new int[]{num,entry});

            if(pq.size() > k){
                pq.poll();
            }
        }
        int [] result = new int [k];
        for(int i=0;i<k;i++){
            result[i] = pq.poll()[0];
        }

        return result;
        
    }
}
