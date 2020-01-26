package com.company;

import Lab06_tasks.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //region TASK_1
        TextString str = new TextString();
        str.set('a');
        str.print();
        str.set("A");
        str.print();
        str.set(new char[]{'H', 'e', 'l', 'l', 'o', '!'});
        str.print();
        str.set(new char[]{'H'});
        str.print();
        //endregion

        //region TASK_2
        StaticIncrement.get();
        StaticIncrement.get();
        StaticIncrement.get();
        //endregion

        //region TASK_3
        System.out.println("Min: " + StaticIntMethods.Min(new int[]{6, 3, 0, -8, 3, 8, -3, 5}));
        System.out.println("Max: " + StaticIntMethods.Max(new int[]{-4, 2, 9, -7, 4, 6, 2, 7, 10, -6, 4}));
        System.out.println("Average: " + StaticIntMethods.Average(new int[]{7, 3, -6}));
        //endregion

        //region TASK_4
        System.out.println("Enter int x: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        System.out.printf("\n%d!! = %d", input, StaticDoubleFactorials.GetFactorialCommon(input));
        System.out.printf("\n%d!! = %d", input, StaticDoubleFactorials.GetFactorialRecursive(input));
        //endregion

        //region TASK_5
        System.out.println("\n" + SquareSum.GetCommon(7));
        System.out.println(SquareSum.GetRecursive(7));
        //endregion

        //region TASK_6
        for (int i : StaticArray.Get(new int[]{1,2,3,4,5,6,7,8,9}, 12))
            System.out.print(i + " ");
        System.out.println();
        for (int i : StaticArray.Get(new int[]{1,2,3,4,5,6,7,8,9}, 3))
            System.out.print(i + " ");
        System.out.println();
        //endregion

        //region TASK_7
        for (int i : CharToInt.Get(new char[]{'H', 'e', 'l', 'l', 'o', '!'}))
            System.out.print(i + " ");
        //endregion

        //region TASK_8
        System.out.println("Average: " + IntArrayAverage.Get(new int[]{7, 3, -6}));
        //endregion

        //region TASK_9
        for (char i : CharArraySwap.Get(new char[]{'!', 'o', 'l', 'l', 'e', 'H'}))
            System.out.print(i + " ");
        System.out.println();
        //endregion

        //region TASK_10
        for (int i : IntArgsMaxMin.Get(-9,1,2,3,10))
            System.out.print(i + " ");
        //endregion
    }
}
