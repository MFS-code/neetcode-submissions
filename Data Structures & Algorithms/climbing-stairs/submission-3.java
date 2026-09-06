class Solution {
    public int climbStairs(int n) {
        return recursiveStairs(n, new HashMap<>());
    }

    public int recursiveStairs(int n, HashMap<Integer, Integer> been) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        
        if (been.containsKey(n)) return been.get(n);
        
        int result = recursiveStairs(n - 1, been) + recursiveStairs(n - 2, been);
        been.put(n, result);
        return result;
    }
}
