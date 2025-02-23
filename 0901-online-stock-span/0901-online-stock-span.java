class StockSpanner {

    private Stack<int[]> stack = new Stack<>();

    private int index = 0;

    public StockSpanner() {}
    
    public int next(int price) {
        while(!stack.isEmpty()) {
            int[] top = stack.peek();

            if(top[1] > price) {
                stack.push(new int[]{++index, price});
                return index-top[0];
            } else {
                stack.pop();
            }
        }

        if(stack.isEmpty()) stack.push(new int[]{++index, price});
        return index;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */