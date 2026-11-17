class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
// Time: O(n) | Space: O(n)
