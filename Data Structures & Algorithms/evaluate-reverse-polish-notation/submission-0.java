class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String x : tokens){
            if(x.equals("*")||
             x.equals("+")||
             x.equals("-")||
             x.equals("/")){
                int b = st.pop();
                int a = st.pop();

                switch(x){
                    case "+":
                    st.push(a+b);
                    break;

                    case "*":
                    st.push(a*b);
                    break;

                    case "-":
                    st.push(a-b);
                    break;

                    case "/":
                    st.push(a/b);
                    break;
                }
             }else{
                st.push(Integer.parseInt(x));
             }
        }
        return st.pop();
    }
}
