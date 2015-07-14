package leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/climbing-stairs/
 */
public class LC070ClimbingStairs {
    public int climbStairs(int n, int at, int[] lut) {
        if (at + 2 == n) {
            return 2;
        }
        if (at + 1 == n) {
            return 1;
        }
        if (lut[at] == 0) {
            lut[at] = climbStairs(n, at + 1, lut) + climbStairs(n, at + 2, lut);
        }
        return lut[at];
    }

    public int climbStairs(int n) {
        int[] lut = new int[n];
        Arrays.fill(lut, 0);
        return climbStairs(n, 0, lut);
    }

    public static void main(String[] arguments) {
        LC070ClimbingStairs solution = new LC070ClimbingStairs();
        System.out.println(solution.climbStairs(20));
    }
}
