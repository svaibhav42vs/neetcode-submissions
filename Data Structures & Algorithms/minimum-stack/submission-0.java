

class Pair{
    int x,y;

    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class MinStack {
    Stack<Pair> st = new Stack<>();
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        int min;
        if(st.isEmpty()){
            min = val;
        }else{
            min = Math.min(st.peek().y,val);
        }
        st.push(new Pair(val,min));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        int x = st.peek().x;
        return x;
    }
    
    public int getMin() {
        int x = st.peek().y;
        return x;
    }
}
