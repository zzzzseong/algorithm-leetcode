class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        
        Stack<Integer> stack = new Stack<>();

        for(int i=n-1; i>=0; i--) {
            while(!stack.isEmpty()) {
                int top = stack.peek();
                if(temperatures[top] > temperatures[i]) {
                    answer[i] = top-i;
                    break;
                } else {
                    stack.pop();
                }
            }

            stack.push(i);
        }

        return answer;
    }
}