package Kunal_DSA;

import java.util.Arrays;

public class ArrayConcatenation {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 1 };
    System.out.println(Arrays.toString(getConcatenation(nums)));
  }

  static int[] getConcatenation(int[] nums) {
    int[] newArray = new int[nums.length * 2];
    for (int i = 0; i < nums.length; i++) {
      newArray[i] = nums[i];
      newArray[i + nums.length] = nums[i];
    }
    return newArray;
  }
}
