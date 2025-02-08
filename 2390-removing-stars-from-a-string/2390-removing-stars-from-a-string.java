import java.util.*;

class Solution {
    public String removeStars(String s) {
        Deque<Character> dq = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i); 

            if(c == '*') dq.removeLast();
            else dq.addLast(c);
        }

        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty()) sb.append(dq.removeFirst());
        
        return sb.toString();
    }
}