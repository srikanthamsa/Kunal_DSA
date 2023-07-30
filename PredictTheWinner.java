package Kunal_DSA;

public class PredictTheWinner {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 2 };
        System.out.println(predictTheWinner(nums));
    }

    static boolean predictTheWinner(int[] nums) {
        return winner(nums, 0, nums.length - 1, 1) >= 0;
    }

    static int winner(int[] array, int start, int end, int turn) {
        if (start == end) {
            return turn * array[start];
        }
        int player1 = turn * array[start] + winner(array, start + 1, end, -turn);
        int player2 = turn * array[start] + winner(array, start, end - 1, -turn);
        return turn * Math.max(turn * player1, turn * player2);
    }
}
