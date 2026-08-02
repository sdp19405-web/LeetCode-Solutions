class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }

        // Sort frequencies
        Arrays.sort(freq);

        int pushes = 0;
        int press = 1;
        int count = 0;

        // Traverse from highest frequency to lowest
        for (int i = 25; i >= 0; i--) {

            if (freq[i] == 0) {
                break;
            }

            pushes += freq[i] * press;
            count++;

            // After every 8 letters, increase push count
            if (count % 8 == 0) {
                press++;
            }
        }

        return pushes;
    }
}