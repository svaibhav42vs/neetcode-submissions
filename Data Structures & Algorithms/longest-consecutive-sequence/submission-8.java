class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        
        for(int num : nums){
            set.add(num);
        }

int result = 0;
        for(int x:set){
            int length = 0;
            if(!set.contains(x-1)){
                int y =x;
                while(set.contains(y)){
                    length++;
                    y++;
                }
            }
            result = Integer.max(result,length);
        }

        return result;
            
            }
}
