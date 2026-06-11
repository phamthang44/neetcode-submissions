class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < operations.length; i++) {
            int lastNumber = 0;
            boolean isNumber = operations[i].matches("-?\\d+");
            if (isNumber) {
                lastNumber = Integer.parseInt(operations[i]);
                stack.offerFirst(lastNumber);
            } 
            if ("+".equals(operations[i])) {
                int first = stack.pollFirst();   // most recent
                int second = stack.peekFirst();  // second most recent (keep it!)
                stack.offerFirst(first);         // put first back
                stack.offerFirst(first + second); // push the new record
            }
            if (operations[i].equals("C")) {
                lastNumber = stack.pollFirst();
            }
            if (operations[i].equals("D")) {
                stack.offerFirst(stack.peekFirst() * 2);
            }
        }
        int total = 0;
        for (int score : stack) total += score;
        return total;
    }
}