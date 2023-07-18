package General;

/*You are given a map of a server center, represented as a m * n integer
 matrix grid, where 1 means that on that cell there is a server and 0
 means that it is no server. Two servers are said to communicate if they
 are on the same row or on the same column.

Return the number of servers that communicate with any other server.*/
public class CountServers {
    public static void main(String[] args) {
        Solution47 sol = new Solution47();
//        int[][] grid = {{1, 0}, {1, 1}};
        int[][] grid = {{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};

        int result = sol.countServers(grid);

        System.out.println(result);
    }
}

class Solution47 {

    public int columnHasServer(int[][] array, int row, int col){
//        if(col > array[0].length-1){
//            col = array[0].length-1;
//        }
//        if(row > array.length-1){
//            row = array.length-1;
//        }
        for(int i = row; i < array.length; i++){
            if(array[i][col] == 1){
                return i;
            }
        }
        return -1;
    }

    public int rowHasServer(int[][] array, int row, int col){
//        if(col > array[0].length-1){
//            col = array[0].length-1;
//        }
//        if(row > array.length-1){
//            row = array.length-1;
//        }
        for(int i = col; i < array[0].length; i++){
            if(array[row][i] == 1){
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
                // System.out.print("Before: Grid "+grid[i][j]);
                // System.out.print(" Bit "+bitMap[i][j]+"\n");
                System.out.println("row: "+i);
                printArray(grid);
                System.out.println("BitMap");
                printArray(bitMap);
                if(grid[i][j] == 1 ){

                    int col = rowHasServer(grid, i, j+1);
                    int row = columnHasServer(grid, i+1, j);
                    if(row != -1 && bitMap[row][j] == 0){
                        bitMap[row][j] = 1;
                        count+=1;
                    }
                    if(col != -1 && bitMap[i][col] == 0){
                        bitMap[i][col] = 1;
                        count+=1;
                    }
                    if((row != -1 || col != -1) && bitMap[i][j] == 0){
                        count+=1;
                    }
                    else{
                        bitMap[i][j] = 1;
                    }
                }
                // System.out.print("After: Grid "+grid[i][j]);
                // System.out.print(" Bit "+bitMap[i][j]+"\n");
                System.out.print("***************************\n");
                printArray(grid);
                System.out.println("BitMap");
                printArray(bitMap);
                System.out.println("Count: "+count);
                System.out.println("-------------------------\n");
            }
        }

        return count;
    }

    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
