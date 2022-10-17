package VI;
import java.util.Random;

public class TestClass {
    public static void main(String[] args) {
        int iDNumber[];
        iDNumber = new int[10];
        for(int i = 0; i<10;i++)
        {
            iDNumber[i]= (int) (Math.random() * 10);
            System.out.println(iDNumber[i]);
        }
        System.out.println("\n");
        Student obj = new Student();
        obj.InsertionSort(iDNumber);
        for(int i = 0; i<10;i++)
        {
            System.out.println(iDNumber[i]);
        }
    }
}
