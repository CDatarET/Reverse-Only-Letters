class Solution {
    public String reverseOnlyLetters(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                stack[++top] = s.charAt(i);
            }
        }

        String ret = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))) ret += "" + stack[top--];
            else ret += "" + s.charAt(i);
        }

        return(ret);
    }
}
