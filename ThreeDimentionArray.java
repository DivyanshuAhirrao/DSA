package arrayProg;

public class ThreeDimentionArray {
    public static void main(String[] args) {

        int[][][] arr = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        };

        for(int[][] array2D : arr) {
            for (int[] array1D : array2D) {
                for (int item : array1D) {
                     System.out.print(item+" ");
                }
                System.out.println();
            }
        }

    }
}