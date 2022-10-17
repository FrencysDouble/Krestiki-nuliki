package VI;

public class Student {
    public int[] InsertionSort(int Arr[])
    {
        for (int left = 0; left < Arr.length; left++) {
            int value = Arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < Arr[i]) {
                    Arr[i + 1] = Arr[i];
                } else {
                    break;
                }
            }
            Arr[i + 1] = value;
        }
        return Arr;
    }
}
