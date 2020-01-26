package Lab06_tasks;

public class StaticArray {
    public static int[] Get(int[] array, int input){
        int[] result;
        if (array.length >= input){
            result = new int[input];
            for (int i = 0; i < input; i++)
                result[i] = array[i];
        }
        else{
            result = array;
        }
        return result;
    }
}
