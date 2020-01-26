package Lab06_tasks;

public class TextString {
    private char symbol = 0;
    private String str = "";

    public void set(char input){
        symbol = input;
    }

    public void set(String input){
        str = input;
    }

    public void set(char[] input){
        if (input.length == 1)
            symbol = input[0];
        else if (input.length > 1){
            str = "";
            for (char i : input)
                str += i;
        }
    }

    public void print(){
        System.out.println("Char: " + symbol + "\nString: " + str);
    }
}
