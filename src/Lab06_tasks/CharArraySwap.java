package Lab06_tasks;

public class CharArraySwap {
    public static char[] Get(char[] input){
        for(int i = 0; i < (input.length/2); i++){
            char temp = input[i];
            input[i] = input[input.length-1-i];
            input[input.length-1-i] = temp;
        }
        return input;
    }
}
