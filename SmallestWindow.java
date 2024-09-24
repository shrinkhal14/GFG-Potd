class Solution {
    
    public static String smallestWindow(String s, String p) {
        int[] p_freq = new int[26]; 
        int[] s_freq = new int[26]; 
        for (char c : p.toCharArray()) {
            p_freq[c - 'a']++;
        }

        int start = 0, minStart = -1, minLen = Integer.MAX_VALUE;
        int matched = 0; 
        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            s_freq[endChar - 'a']++;

           
            if (s_freq[endChar - 'a'] <= p_freq[endChar - 'a']) {
                matched++;
            }

            
            while (matched == p.length()) {
               
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                
                char startChar = s.charAt(start);
                s_freq[startChar - 'a']--;

                if (s_freq[startChar - 'a'] < p_freq[startChar - 'a']) {
                    matched--;
                }

                start++; 
            }
        }

        
        return minStart == -1 ? "-1" : s.substring(minStart, minStart + minLen);
    }
}
