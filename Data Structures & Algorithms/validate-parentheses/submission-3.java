class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();

        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');


        // edge cases
        // empty string or odd-length String
        if(s.isBlank() || s.length() % 2 != 0)
            return false;

        // PDA style... for each char.. add to stack if it is an opening brace
        // when we come across it's closer... pop both off
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for(char c: arr){
            boolean isOpener = c == '[' || c == '{' || c == '(';
            if(isOpener){
                stack.push(c);
            }else if(map.containsKey(c)){
                if(stack.isEmpty())
                    return false;

                if(stack.pop() != map.get(c))
                    return false;
            }else{
                return false;
            }
        }

        return stack.size() == 0;
    }
}
