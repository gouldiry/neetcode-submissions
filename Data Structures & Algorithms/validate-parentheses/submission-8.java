public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        Map<Character, Character> nMap = new HashMap<>();
        nMap.put(')','(');
        nMap.put(']','[');
        nMap.put('}','{');
        for(char c : s.toCharArray()){
            if(nMap.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == nMap.get(c)){
                    stack.pop();
                } else {
                    return false;
                }
            } else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}