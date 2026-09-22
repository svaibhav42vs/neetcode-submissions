class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        if(s.length()==0){
            return 0;
        }
        int left=0;
        int maxlength =1;
        for(int right=0;right<s.length();right++){
            char CurrentChar = s.charAt(right);
            while(set.contains(CurrentChar)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(CurrentChar);
            maxlength =  Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
