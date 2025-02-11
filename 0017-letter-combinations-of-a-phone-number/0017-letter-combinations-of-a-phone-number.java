class Solution {
    private String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private List<String> answer = new ArrayList<>();
    private StringBuilder sb = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return answer;
        traversal(digits, 0);
        return answer;
    }

    public void traversal(String digits, int depth) {
        if(depth >= digits.length()) {
            answer.add(sb.toString());
            return;
        }

        int idx = digits.charAt(depth)-'0';

        String letter = letters[idx-2];
        for(int i=0; i<letter.length(); i++) {
            sb.append(letter.charAt(i));
            traversal(digits, depth+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}