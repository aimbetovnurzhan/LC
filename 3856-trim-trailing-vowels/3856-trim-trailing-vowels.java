class Solution {
    public String trimTrailingVowels(String s) {
        var vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int i = s.length() - 1;
        while (i >= 0) {
            if (!vowels.contains(s.charAt(i))) return s.substring(0, i + 1);;
            i--;
        }
        return "";
    }
}