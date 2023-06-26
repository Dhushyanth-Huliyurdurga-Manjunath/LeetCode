class SubrectangleQueries {
    int[][] matrix;

    public SubrectangleQueries(int[][] rectangle) {
        // matrix = new int[rectangle.length][rectangle[1].length];
        matrix = rectangle;

        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[i].length; j++){
        //         matrix[i][j] = rectangle[i][j];
        //     }
        // }
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1; i <= row2; i++){
            for(int j = col1; j <= col2; j++){
                matrix[i][j] = newValue;
                // if(i >= row1 && i <= row2 && j >= col1 && j <= col2){
                //     matrix[i][j] = newValue;
                // }
            }
        }

        return;
    }
    
    public int getValue(int row, int col) {
        return matrix[row][col];
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[i].length; j++){
        //         if(i == row && j == col)
        //             return matrix[i][j];
        //     }
        // }
        // return 0;
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */