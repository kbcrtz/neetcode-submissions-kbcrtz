class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> myStack = new Stack<>();
        Stack<Character> myStack2 = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            Character c = Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(c)){
                myStack.push(c);
            }
        }
        for(int i = s.length() -1; i >= 0; i--){
            Character c = Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(c)){
                myStack2.push(c);
            }
        }
        // String ms1 = myStack.toString();
        // while(!myStack.isEmpty()){
        //     myStack2.push(myStack.pop());
        // }
        // String ms2 = myStack2.toString();
        return myStack.equals(myStack2);
    }
}
