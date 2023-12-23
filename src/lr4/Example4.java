package lr4;

public class Example4 {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j <= i; j++) {
                arr[i] = new int[j];
            }
        }
        for(int[] x: arr)
        {
            for (int y: x) System.out.print(y);
            System.out.println();
        }
    }
}
