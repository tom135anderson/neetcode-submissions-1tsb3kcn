class Solution {
    public int characterReplacement(String s, int k) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            charSet.add(c);
        }

        int result = 0;

        // we are checking every unique character
        for(char c: charSet){
            int count = 0;
            int l = 0;

            // start a sliding window
            for(int r=0;r<s.length();r++){
                if(c == (s.charAt(r))){
                    count++;
                }
                // if the number of change 
                while(((r-l) + 1) - count > k){
                    // since we are moving the left window, decrement the count if the charAt is our target
                    if(s.charAt(l) == c){
                        count--;
                    }
                    l++;
                }


                result = Math.max(result, (r - l) + 1);
                // end sliding window
            }            

        }
        return result;
    }
}
