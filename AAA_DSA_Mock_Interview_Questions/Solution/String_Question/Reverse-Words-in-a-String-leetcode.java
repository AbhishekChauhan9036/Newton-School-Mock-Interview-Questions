//https://leetcode.com/problems/reverse-words-in-a-string/submissions/

class Solution {
    public String reverseWords(String s) {
        String [] str = s.split(" +"); //regex to split the input string on the basis on any no. of spaces
        int n = str.length;
        StringBuilder sb = new StringBuilder(n);
        
        for(int i=n-1; i>=0;i--){
            sb.append(str[i]+" ");
        }
        return sb.toString().trim(); //trim method to remove extra spaces at the end
    }
}