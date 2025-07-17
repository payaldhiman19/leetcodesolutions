class Solution {
    public String frequencySort(String s) {
        // Step 1: Frequency Map
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Max Heap (PriorityQueue) by frequency
        PriorityQueue<Map.Entry<Character, Integer>> pq =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(freqMap.entrySet());

        // Step 3: Build the answer string
        StringBuilder ans = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char ch = entry.getKey();
            int freq = entry.getValue();

            // Append the character 'freq' times
            for (int i = 0; i < freq; i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
