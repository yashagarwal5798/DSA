class Solution {
    public String reversePrefix(String word, char ch) {
         Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int i =0;
         while (i < word.length()) {
            stack.push(word.charAt(i));
            if (word.charAt(i) == ch) {
                break;
            }
            i++;
        }
        if(word.length() == i)
        {
            return word;
        }
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        for (int j = i + 1; j < word.length(); j++) {
            ans.append(word.charAt(j));
        }
        return ans.toString();
    }
}