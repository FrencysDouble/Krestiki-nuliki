package V;

public class Task {
    public static int recursion(int Arr[])
    {
        int i = 0;
        if( i<10)
        {
            for(i=0;i<10;i++) {
                if(Arr[i] % 2 == 0)
                {
                    System.out.println(Arr[i]);
                }
            }
        }
        return i++;
    }
}
