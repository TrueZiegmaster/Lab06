package Lab06_tasks;

public class StaticIncrement {
    private static int id = 0;
    public static void get(){
        System.out.println(id++);
    }
}
