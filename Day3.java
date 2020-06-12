//Two city scheduling
/*
Approach:
sort the array in increasing order of differences between cost of going to city A and city B.
Then first half of the people can be sent to city A and second half to city B.
*/

class Solution {
    class SortByDiff implements Comparator<int[]> {
        
        @Override
        public int compare(int[] a, int[] b) {
            return (a[0]-a[1] > b[0]-b[1]) ? 1 : -1;
        }
    }
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new SortByDiff());
        int result = 0;
        int n = costs.length;
        for(int i = 0;i < n;i++){
            result += i < n / 2 ? costs[i][0] : costs[i][1];
        }
        return result;
    }
}
