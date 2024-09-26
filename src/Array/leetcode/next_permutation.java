 package Array.leetcode;

import java.util.Arrays;


 public class next_permutation {

    static void nextPermutation(int[] arr) {
        if (arr.length == 1) return;

        int idx1 = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx1 = i;
                break;
            }
        }

        if (idx1 < 0) {
            reverse(arr, 0, arr.length - 1);
        } else {
            int idx2 = 0;

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] > arr[idx1]) {
                    idx2 = i;
                    break;
                }
            }

            swap(arr, idx1, idx2);

            reverse(arr, idx1 + 1, arr.length - 1);
        }
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums));
    }
}
