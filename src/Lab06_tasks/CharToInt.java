package Lab06_tasks;

public class CharToInt {
    public static int[] Get(char[] input){
        int[] array = new int[input.length];
        for(int i = 0; i < input.length; i++)
            array[i] = input[i];
        return array;
    }
}
