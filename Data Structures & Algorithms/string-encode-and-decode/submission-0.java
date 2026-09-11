class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for(String s:strs){
            builder.append(s.length()).append('#').append(s);
        }

        return builder.toString();

    }

    public List<String> decode(String s) {
        List<String> result  = new ArrayList<>();
        int i=0;
        while(i <s.length()){
            int j=i;
            while(s.charAt(j) != '#'){
                j++;
            }
                int length = Integer.parseInt(s.substring(i, j));
                 String str = s.substring(j + 1, j + 1 + length);
            result.add(str);

            i = j + 1 + length;

        }
        return result;
    }
}
