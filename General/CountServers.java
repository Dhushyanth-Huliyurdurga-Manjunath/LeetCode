package General;

public class CountServers {
    public static void main(String[] args){
        Solution47 sol = new Solution47();
        int[][] grid = {{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};

        int result = sol.countServers(grid);

        System.out.println(result);
    }
}

class Solution47 {

    public int columnHasServer(int[][] array, int col, int row){
        if(col > array[0].length-1){
            col = array[0].length-1;
        }
        if(row > array.length-1){
            row = array.length-1;
        }
        for(int i = 0; i < col; i++){
            if(array[row][i] == 1){
                return i;
            }
        }
        return -1;
    }

    public int rowHasServer(int[][] array, int col, int row){
        if(col > array[0].length-1){
            col = array[0].length-1;
        }
        if(row > array.length-1){
            row = array.length-1;
        }
        for(int i = 0; i < row; i++){
            if(array[i][col] == 1){
                return i;
            }
        }
        return -1;
    }

    public int countServers(int[][] grid) {
        int[][] bitMap = new int[grid.length][grid[0].length];
        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                bitMap[i][j] = 0;
            }
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1 && bitMap[i][j] == 0){
                    bitMap[i][j] = 1;
                    int row = rowHasServer(grid, i+1, j+1);
                    int col = columnHasServer(grid, i+1, j+1);
                    if(row != -1){
                        bitMap[row][j] = 1;
                        count++;
                    }
                    else if(col != -1){
                        bitMap[i][col] = 1;
                        count++;
                    }
                }
            }
        }

        return count;

    }
}
