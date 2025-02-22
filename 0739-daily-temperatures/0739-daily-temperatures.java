class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        
        Stack<int[]> stack = new Stack<>();
        for(int i=n-1; i>=0; i--) {
            while(!stack.isEmpty()) {
                int[] temperature = stack.peek();
                if(temperature[0] > temperatures[i]) {
                    answer[i] = temperature[1]-i;
                    stack.push(new int[]{temperatures[i], i});
                    break;
                } else {
                    stack.pop();
                }
            }

            if(stack.isEmpty()) stack.push(new int[]{temperatures[i], i});
        }

        return answer;
    }
}