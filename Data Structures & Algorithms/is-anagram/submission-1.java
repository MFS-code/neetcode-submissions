class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> freqs = new HashMap<>();

        for (Character x : s.toCharArray()) {
            if (!freqs.containsKey(x)) {
                freqs.put(x, 1);
            } else {
                int freq = freqs.get(x) + 1;
                freqs.put(x, freq);
            }
        }

        for (Character x : t.toCharArray()) {
            if (!freqs.containsKey(x)) return false;
            int freq = freqs.get(x) - 1;
            freqs.put(x, freq);
            if (freqs.get(x) < 1) freqs.remove(x);
        }

        return freqs.isEmpty();
    }
}
