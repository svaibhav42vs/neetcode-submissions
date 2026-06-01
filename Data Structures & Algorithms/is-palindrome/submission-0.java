class Solution {
    public boolean isPalindrome(String s) {

        String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i=0;
        int j = cleaned.length()-1;
        boolean flag = true;
        while(i<=j){
            if(cleaned.charAt(i) == cleaned.charAt(j)){
                i++;
                j--;
                
            }else{
                flag = false;
                break;
            }
        }
        if(!flag){
            return false;
        }else{
            return true;
        }

    }
}
