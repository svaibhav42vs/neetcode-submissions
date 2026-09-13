class Solution {
    public int longestConsecutive(int[] nums) {

if(nums.length == 0){
    return 0;
}
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){
            set.add(x);
        }

        int max = 1;

        for(int x: set){
            if(!set.contains(x-1)){
            int y = x;
            int len =1;
            while(set.contains(y+1)){
                len++;
                y++;
            }
            max = Math.max(len,max);
            }

        }

        return max;
        
    }
}
