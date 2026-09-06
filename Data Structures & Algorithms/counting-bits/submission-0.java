class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int number = i;

            while (number != 0) {
                if (number % 2 == 1) count++;
                number /= 2;
            }
            result[i] = count;
        }
        return result;
    }
}
