package com.Glebass.junit;

import java.util.Random;

public class Game {
    public static Random random = new Random();
    public static int[] CubeRandomp1()
    {
        int[] arrp1 = new int[5];
        for (int i=0;i<arrp1.length;i++) {
            int p1 = random.nextInt(1*6);
            arrp1[i] = p1;
            System.out.println(p1);
        }
        return arrp1;
    }
    public static int[] CubeRandomp2()
    {
        int[] arrp2 = new int[5];
        for (int i =0; i<arrp2.length;i++)
        {
            int p2 = random.nextInt(1*6);
            arrp2[i]= p2;
            System.out.println(p2);
        }
        return arrp2;
    }
    public static int ArrSum(int arr[])
    {
        int temp = 0;
        for(int i =0;i<arr.length; i++)
        {
            temp = temp+arr[i];
        }
        System.out.println(temp);
        return temp;
    }
    public static void Result(int temp1,int temp2)
    {
        if(temp1>temp2)
        {
            System.out.println("Первый игрок победил");
        }
        if(temp2>temp1)
        {
            System.out.println("Второй игрок победил");
        }
        else if (temp1 == temp2)
        {
           System.out.println("Ничья");
        }
    }
}
