class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s1 = new Stack<>();
        for(String c : operations) {
            if(c.equals("C") && s1.size() > 0) {
                s1.pop();
            }
            else if(c.equals("D") && s1.size() > 0) {
                int pr = s1.peek();
                s1.push(pr*2);
            }
            else if(c.equals("+") && s1.size() > 1) {
                int pr1 = s1.pop();
                int pr2 = s1.pop();
                int res = pr1+pr2;
                s1.push(pr2);
                s1.push(pr1);
                s1.push(res);
            }
            else {
                s1.push(Integer.parseInt(c));
            }
        }
        int sum = 0;
        while(!s1.isEmpty()) {
            sum += s1.pop();
        }
        return sum;
    }
}