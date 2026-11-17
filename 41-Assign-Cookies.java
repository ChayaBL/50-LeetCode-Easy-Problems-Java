class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); Arrays.sort(s);
        int child = 0, cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) child++;
            cookie++;
        }
        return child;
    }
}
// Time: O(n log n + m log m) | Space: depends on sorting implementation
