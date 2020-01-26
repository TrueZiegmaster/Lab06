package Lab06_tasks;

public class StaticIntMethods {
    public static int Min(int... input){
        int min = Integer.MAX_VALUE;
        for (int i : input){
            if (i < min)
                min = i;
        }
        return min;
    }

    public static int Max(int... input){
        int max = Integer.MIN_VALUE;
        for (int i : input){
            if (i > max)
                max = i;
        }
        return max;
    }

    public static int Average(int... input){
        int average = 0;
        for (int i : input){
            average += i;
        }
        return average / input.length;
    }
}
