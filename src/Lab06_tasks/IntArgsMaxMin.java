package Lab06_tasks;

public class IntArgsMaxMin {
    public static int[] Get(int... input){
        return new int[]{Max(input), Min(input)};
    }

    private static int Min(int[] input){
        int min = Integer.MAX_VALUE;
        for (int i : input){
            if (i < min)
                min = i;
        }
        return min;
    }

    private static int Max(int[] input){
        int max = Integer.MIN_VALUE;
        for (int i : input){
            if (i > max)
                max = i;
        }
        return max;
    }
}
