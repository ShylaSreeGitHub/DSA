import java.util.Arrays;

public class TransposeMAtrix {
    public static void main(String[] args) {
        int[][] arr = {
                {2,4,-1},
                {-10,5,11}
//                ,{18,-7,6}
        };
        for (int[] sub_matrix : transpose(arr)){
            System.out.println(Arrays.toString(sub_matrix));
        }
    }
    static int[][] transpose(int[][] matrix){
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int row = 0; row < matrix[0].length; row++){
            for(int col = 0; col < matrix.length; col++){
                transpose[row][col] = matrix[col][row];
            }
        }

        return transpose;
    }
}
