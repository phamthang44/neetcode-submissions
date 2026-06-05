class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        //1,2,2,3,3 limit = 3
        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            } 
            right--;
            boats++;
            //lần 1 boat = 0 -> 1
            //lần 2 boat = 1 -> 2
            //lần 3 boat = 2 -> 3 left lên index 1 value là 2, right-- > 2 - 1 = 1 
            //lần 4 boat = 3 -> 4
        }
        return boats;
    }
}