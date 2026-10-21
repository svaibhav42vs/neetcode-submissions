class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set = new HashSet<>();
        if(s.length() == 0){
            return 0;
        }
        int maxlength=1;
        int left=0;
        for(int right=0;right<s.length();right++){
            char currentchar = s.charAt(right);
            while (set.contains(currentchar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentchar);
            maxlength = Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
