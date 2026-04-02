class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){return false;}
        Stack<Character> chars = new Stack<>();
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                chars.push(s.charAt(i));
            }else if(!chars.isEmpty()){
                if(!match(chars.pop(),s.charAt(i))){
                    return false;
                }
            }else{return false;}
        }
        if(!chars.isEmpty()){return false;}
        return true;
    }
    public boolean match(char c, char b){
        if(c == '(' && b == ')'){return true;}
        if(c == '[' && b == ']'){return true;}
        if(c == '{' && b == '}'){return true;}
        return false;
    }
}
