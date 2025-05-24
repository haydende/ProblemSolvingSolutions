package solutions;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[0] + nums[i] == target) {
                return new int[]{ 0, i };
            }
        }
        if (nums.length > 1) {
            int[] subArr = Arrays.copyOfRange(nums, 1, nums.length);
            int[] subResult = twoSum(subArr, target);
            return new int[] { subResult[0]+1, subResult[1]+1 };
        }
        return new int[] { 0, 0 };
    }
}
