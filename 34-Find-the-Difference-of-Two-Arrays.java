class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>(), b = new HashSet<>();
        for (int n : nums1) a.add(n);
        for (int n : nums2) b.add(n);
        List<Integer> onlyA = new ArrayList<>(), onlyB = new ArrayList<>();
        for (int n : a) if (!b.contains(n)) onlyA.add(n);
        for (int n : b) if (!a.contains(n)) onlyB.add(n);
        return Arrays.asList(onlyA, onlyB);
    }
}
// Time: O(n + m) average | Space: O(n + m)
