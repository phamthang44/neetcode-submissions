class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int student : students) {
            queue.offer(student);
        }

        int sandwichIndex = 0;
        int rotations = 0;

        while (!queue.isEmpty()) {
            int student = queue.poll();

            if (student == sandwiches[sandwichIndex]) {
                sandwichIndex++;
                rotations = 0; // có người ăn được
            } else {
                queue.offer(student);
                rotations++;
            }

            if (rotations == queue.size()) {
                return queue.size();
            }
        }

        return 0;
    }
}