class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res = "";
        for (String word: words) {
            int i = 0;
            for (char c:word.toCharArray()) {
                i += weights[c - 'a'];
            }
            i = i % 26;
            res = res + (char)((25 - i) + 'a');
        }
        return res;
    }
}