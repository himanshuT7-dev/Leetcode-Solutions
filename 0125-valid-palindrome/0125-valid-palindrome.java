class Solution {
    public boolean isPalindrome(String s) {
        String a1 = s.replaceAll("[^a-zA-Z0-9]","");
        a1 = a1.toLowerCase();
        String temp = a1;
        String rev="";

        for(int i=a1.length()-1;i>=0;i--)
        {
            rev = rev+a1.charAt(i);
        }

        return rev.equals(temp);
    }
}