class Solution {
    private String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private List<String> answer = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return answer;
        traversal(digits.split(""), "", 0);
        return answer;
    }

    public void traversal(String[] digits, String str, int depth) {
        if(depth >= digits.length) {
            answer.add(str);
            return;
        }

        String letter = letters[Integer.parseInt(digits[depth])-2];
        for(int i=0; i<letter.length(); i++) {
            traversal(digits, str+letter.charAt(i), depth+1);
        }
    }
}