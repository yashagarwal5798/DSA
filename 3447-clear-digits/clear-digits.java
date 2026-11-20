class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
         while (!st.isEmpty()) 
        {
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}