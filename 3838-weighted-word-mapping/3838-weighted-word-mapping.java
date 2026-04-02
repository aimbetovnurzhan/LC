class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res = "";
        for (String word: words) {
            int i = 0;
            for (char ch:word.toCharArray()) {
                i += weights[ch - 'a'];
            }
            res = res + (char)('z' - i % 26);
        }
        return res;
    }
}