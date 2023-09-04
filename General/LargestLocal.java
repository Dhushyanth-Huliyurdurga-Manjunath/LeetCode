package General;

/**
 * @author: Dhushyanth Huliyurdurga Manjunath
 * @since: 9/4/23 1:01 PM
 */
public class LargestLocal {
    public static void main(String[] args){
        int[][] grid = {{1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}};

        Solution79 sol = new Solution79();

        int[][] result = sol.largestLocal(grid);

        System.out.println("[");
        for(int[] i: result){
            System.out.print("[ ");
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.print("]\n");
        }
        System.out.println("]");
    }
}

class Solution79 {
    public int findMax(int[][] array, int i, int j){
        int max = 0;
        int row, col;

        for(row = i - 1; row <= i + 1; row++){
            for(col = j - 1; col <= j + 1; col++){
                if(array[row][col] > max){
                    max = array[row][col];
                }
            }
        }

        return max;
    }

    public int[][] largestLocal(int[][] grid) {
        int size = grid.length;
        int[][] resultantMatrix = new int[size - 2][size - 2];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i + 1 < size - 1 && j + 1 < size - 1){
                    resultantMatrix[i][j] = findMax(grid, i + 1, j + 1);
                }
            }
        }

        return resultantMatrix;
    }
}
