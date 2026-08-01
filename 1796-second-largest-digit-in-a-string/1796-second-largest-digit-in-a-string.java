class Solution {
    public int secondHighest(String s) {

        int largest = -1;
        int secLargest = -1;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {

                int num = c - '0';

                if (num > largest) {
                    secLargest = largest;
                    largest = num;
                }
                else if (num > secLargest && num != largest) {
                    secLargest = num;
                }
            }
        }

        return secLargest;
    }
}