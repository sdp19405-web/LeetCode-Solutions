class Solution {
    public int compress(char[] chars) {

        int index = 0;   // position to write
        int i = 0;       // position to read

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            chars[index++] = current;

            if (count > 1) {
                String num = String.valueOf(count);
                for (char c : num.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}