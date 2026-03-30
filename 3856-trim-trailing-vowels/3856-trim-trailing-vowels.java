class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length();
        var vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        if (n == 1) {
            return vowels.contains(s.charAt(0))? "": s;
        }
        int pointer = 0;
        for (int i = 0; i < n; i++) {
            if (!vowels.contains(s.charAt(i))) {
                pointer = i + 1;
            }
        }
        return s.substring(0, pointer);
    }
}