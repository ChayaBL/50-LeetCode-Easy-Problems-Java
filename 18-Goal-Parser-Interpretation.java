class Solution {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
// Time: O(n) | Space: O(n) for returned string
