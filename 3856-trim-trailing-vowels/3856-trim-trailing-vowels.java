class Solution {
    public String trimTrailingVowels(String s) {
        var vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int pointer = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!vowels.contains(s.charAt(i))) {
                pointer = i + 1;
                break;
            }
        }
        return s.substring(0, pointer);
    }
}