package Lab06_tasks;

public class SquareSum {
    public static int GetCommon(int input){
        int sum = 0;
        for (int i = 1; i < input+1; i++)
            sum += Math.pow(i, 2);
        return sum;
    }

    public static int GetRecursive(int input){
        if (input > 0)
            return (int)(Math.pow(input, 2) + GetRecursive(input-1));
        else
            return input;
    }
}
