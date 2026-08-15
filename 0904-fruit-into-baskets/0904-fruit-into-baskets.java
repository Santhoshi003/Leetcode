class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int len;
        int left = 0;
        int maxi = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int right = 0; right < n; right++) {
            map1.put(fruits[right],map1.getOrDefault(fruits[right],0)+1);
            while(map1.size() > 2) {
                map1.put(fruits[left],map1.get(fruits[left])-1);
                if(map1.get(fruits[left]) == 0) {
                    map1.remove(fruits[left]);
                }
                left++;
            }
            len = right - left + 1;
            maxi = Math.max(len,maxi);
        }
        return maxi;
    }
}