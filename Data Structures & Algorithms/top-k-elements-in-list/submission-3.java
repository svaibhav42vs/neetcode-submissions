class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length+1;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> maxheap = 
        new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        maxheap.addAll(map.entrySet());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxheap.poll().getKey();
        }
        return result;
    }
}
