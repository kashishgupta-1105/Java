package JavaProblems;
import java.util.*;

import java.util.Arrays;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int n = intervals.length;
        int[][] result = new int[n][2];

        int index = 0;
        result[0][0] = intervals[0][0];
        result[0][1] = intervals[0][1];

        // merge
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= result[index][1]) {
                // overlap → extend end
                result[index][1] = Math.max(result[index][1], intervals[i][1]);
            } else {
                // no overlap → new interval
                index++;
                result[index][0] = intervals[i][0];
                result[index][1] = intervals[i][1];
            }
        }
        return Arrays.copyOf(result, index + 1);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] merged = merge(intervals);

        for (int[] in : merged) {
            System.out.println(Arrays.toString(in));
        }
    }


        if (intervals.length <= 1)
            return intervals;

        // Step 1: Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Create result array (max possible size = intervals.length)
        int[][] result = new int[intervals.length][2];

        int index = 0;

        // Step 3: Initialize first interval
        result[index][0] = intervals[0][0];
        result[index][1] = intervals[0][1];

        // Step 4: Merge logic
        for (int i = 1; i < intervals.length; i++) {

            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            int lastEnd = result[index][1];

            // Overlapping case
            if (currentStart <= lastEnd) {
                result[index][1] = Math.max(lastEnd, currentEnd);
            }
            // Non-overlapping case
            else {
                index++;
                result[index][0] = currentStart;
                result[index][1] = currentEnd;
            }
        }

        // Step 5: Return only filled rows
        return Arrays.copyOf(result, index + 1);
    }

    // Test
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 4},
                {2, 6},
                {7, 10},
                {10,12},
                {15, 18}
        };

        int[][] merged = merge(intervals);

        for (int[] interval : merged) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}
