public class Solution {
    public boolean isValid(String s) {
        Stack<Character> newStack = new Stack();
        Map<Character, Character> newMap = new HashMap<>();
        newMap.put(')', '(');
        newMap.put(']', '[');
        newMap.put('}', '{');
        for(char c : s.toCharArray()){
            if(newMap.containsKey(c)){
                if(!newStack.isEmpty() && newStack.peek() == newMap.get(c)){
                    newStack.pop();
                } else{
                    return false;
                }
            } else{
                newStack.push(c);
            }
        }
        return newStack.isEmpty();
    }
}