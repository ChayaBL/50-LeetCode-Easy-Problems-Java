class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        for (int value : salary) {
            min = Math.min(min, value);
            max = Math.max(max, value);
            sum += value;
        }
        return (double)(sum - min - max) / (salary.length - 2);
    }
}
// Time: O(n) | Space: O(1)
