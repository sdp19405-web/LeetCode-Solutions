class Solution {

    public int compress(char[] chars) {

        String ans = "";

        int i = 0;

        while (i < chars.length) {

            char ch = chars[i];

            int count = 0;

            // Count same characters
            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }

            ans = ans + ch;

            if (count > 1) {
                ans = ans + count;
            }
        }

        // Put compressed string back into chars array
        for (int j = 0; j < ans.length(); j++) {
            chars[j] = ans.charAt(j);
        }

        return ans.length();
    }
}