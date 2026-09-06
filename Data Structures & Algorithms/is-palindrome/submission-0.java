class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (i < j) {
            while (!isAlphanumeric(s.charAt(i)) && i < j) {
                i++;
            }
            while (!isAlphanumeric(s.charAt(j)) && i < j) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public boolean isAlphanumeric(char x) {
        return ((x >= 'A' && x <= 'Z') ||
                (x >= 'a' && x <= 'z') ||
                (x >= '0' && x <= '9'));
    }
}
