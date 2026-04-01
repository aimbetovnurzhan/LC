class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        var res = new ArrayList<Integer>();
        var temp = new int[101];
        for (int i: bulbs) {
            if (temp[i] == 0) {
                temp[i] = 1;
            } else {
                temp[i] = 0;
            }
        }
        for (int i = 1; i <= 100; i++) {
            if (temp[i] == 1) {
                res.add(i);
            }
        }
        return res;
    }
}