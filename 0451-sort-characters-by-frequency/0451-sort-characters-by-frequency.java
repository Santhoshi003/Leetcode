class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map1.put(ch,map1.getOrDefault(ch,0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map1.get(b) - map1.get(a));
        pq.addAll(map1.keySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            char ch = pq.poll();
            for(int i = 0; i < map1.get(ch); i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}