class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int rank = 1;
        HashMap<Integer,Integer> map1 = new HashMap<>();

        for(int x : temp) {
            if(!map1.containsKey(x)) {
                map1.put(x,rank);
                rank++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = map1.get(arr[i]);
        }

        return arr;
    }
}