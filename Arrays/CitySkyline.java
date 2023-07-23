import java.util.*;

class Solution18 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        ArrayList<ArrayList<Integer>> array = new ArrayList<>(grid.length);
        ArrayList<ArrayList<Integer>> transposeArray = new ArrayList<>(grid[1].length);
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid[1].length];

        for (int row = 0; row < grid.length; row++) {
            array.add(new ArrayList<>());
            for (int col = 0; col < grid[1].length; col++) {
                array.get(row).add(grid[row][col]);
            }
            rowMax[row] = Collections.max(array.get(row));
        }

        for (int col = 0; col < grid[1].length; col++) {
            transposeArray.add(new ArrayList<>());
            for (int row = 0; row < grid.length; row++) {
                transposeArray.get(col).add(grid[row][col]);
            }
            colMax[col] = Collections.max(transposeArray.get(col));
        }

        int idx = 0;
        int height = 0;
        // for(ArrayList<Integer> a: array){
        // for(int i: a){
        // int minValue = Math.min(rowMax[idx], colMax[idx]);
        // if(i < minValue){
        // height += Math.abs(minValue - i);
        // System.out.print(i+"->"+(minValue-i)+" ");
        // }
        // }
        // System.out.println("");
        // idx++;
        // }

        
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[1].length; col++) {
                int minValue = Math.min(rowMax[row], colMax[col]);
                int value = array.get(row).get(col);
                if (value < minValue) {
                    height += Math.abs(minValue - value);
                    System.out.print(value + "->" + (minValue - value) + " ");
                }
            }
        }

        // System.out.println(array+" \n"+transposeArray);
        // for(int i: rowMax){
        // System.out.print(i+" ");
        // }
        // for(int i: colMax){
        // System.out.println(i+" ");
        // }

        // for(int i = 0; i < grid.length; i++){
        // int rowMax = Collections.max(array.get(i));
        // for(int j = 0; j < grid[1].length; j++){
        // int colMax = Collections.max(array.get());
        // array.get(i).add(grid[i][j]);
        // }
        // }

        return height;
    }
}