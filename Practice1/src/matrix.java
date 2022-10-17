import.java.util.Array
public class matrix {
    String[][]Matrix = new String[10][10];
    void Mfilling()
    {
        int i =0;
        Minsert(0,0,"ПО");
        Minsert(0,6,"ПО");
        for (int j=1;j< Matrix.length;j++)
        {
            if(j <=5) {
                Matrix[i][j] = "1";
            }
        }
    }
    void Minsert(int i, int j,String data) {

        Matrix[i][j] = data;
    }
    void Mprint()
    {
        for (int i=0;i<Matrix.length;i++)
        {
            for (int j=0; j< Matrix.length;j++)
            {
                System.out.print(Matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }



}
