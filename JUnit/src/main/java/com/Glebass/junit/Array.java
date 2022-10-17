package com.Glebass.junit;

import java.util.Random;

public class Array {
    public static int Arraysum()
    {
        int min = 100;
        int max = 200;
        int diff = max - min;
        int temp = 0;
        Random random = new Random();
        int array[] = new int[10];
        for(int i=0;i< array.length;i++)
        {
            int b = random.nextInt(diff +1);
            array[i] = b;
            System.out.println(array[i]);
        }
        for ( int i =0;i < array.length;i++)
        {
            temp = array[i] + temp;
        }
        System.out.println(temp);
        return temp;
    }
}
