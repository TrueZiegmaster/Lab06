package Lab06_tasks;

public class StaticDoubleFactorials {
    public static int GetFactorialCommon(int input){
        int factorial = 1;
        for (; input > 1; input -= 2)
            factorial *= input;
        return factorial;
    }

    public static int GetFactorialRecursive(int input){
        if (input > 2)
            return input * GetFactorialRecursive(input - 2);
        else
            return input;
    }
}
