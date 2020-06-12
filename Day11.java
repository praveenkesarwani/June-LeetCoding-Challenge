//Sort Colors
class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] == 2 && i < right) {
                swap(nums, i, right);
                right--;
            }
            while (nums[i] == 0 && i > left) {
                swap(nums, i, left);
                left++;
            }
        }
    }

    private void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
} 