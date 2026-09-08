class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();

        for(String x : strs){
            int [] freq = new int[26];

            for(char c : x.toCharArray()){
                freq[c -'a']++;
            }

            StringBuilder builder = new StringBuilder();

            for(int count : freq){
                builder.append('#').append(count);
            }

            map.computeIfAbsent(builder.toString(),k -> new ArrayList()).add(x);
        }

        return new ArrayList<>(map.values());
    }
}
