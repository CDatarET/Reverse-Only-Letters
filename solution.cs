public class Solution {
    public string ReverseOnlyLetters(string s) {
        char[] stack = new char[s.Length];
        int top = -1;
        for(int i = 0; i < s.Length; i++){
            if(char.IsLetter(s[i])) stack[++top] = s[i];
        }

        string ret = "";
        for(int i = 0; i < s.Length; i++){
            if(char.IsLetter(s[i])) ret += "" + stack[top--];
            else ret += "" + s[i];
        }

        return(ret);
    }
}
