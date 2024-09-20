class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // Step 1: Split the string by dots
        String[] words = str.split("\\.");

        // Step 2: Reverse the array of words
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        // Step 3: Join the reversed words with dots
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                result.append(".");
            }
            result.append(words[i]);
        }

        return result.toString();
    }
}
