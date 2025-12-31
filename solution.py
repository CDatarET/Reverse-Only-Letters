class Solution:
    def reverseOnlyLetters(self, s):
        stack = []
        for c in s:
            if c >= "A" and c <= "Z" or c >= "a" and c <= "z":
                stack.append(c)

        top = len(stack) - 1
        ret = ""
        for c in s:
            if c >= "A" and c <= "Z" or c >= "a" and c <= "z":
                ret += stack[top]
                top -= 1
            else:
                ret += c
        
        return ret
