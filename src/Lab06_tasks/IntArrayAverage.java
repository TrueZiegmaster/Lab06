package Lab06_tasks;

public class IntArrayAverage {
    public static int Get(int[] input){
        int average = 0;
        for (int i : input)
            average += i;
        return average / input.length;
    }
}
