class Solution {
    public String reversePrefix(String word, char ch) {
        char [] arr = word.toCharArray();
        int end = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ch) {
                end = i;
                break;
            }
        }
        int j = end;
        int i = 0;
        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}