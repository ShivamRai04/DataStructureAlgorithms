class Solution {
    public void setZeroes(int[][] matrix) {
    
        Set<Integer> rowIndex = new HashSet<>();
        Set<Integer> columnIndex = new HashSet<>();
        int columns= matrix.length;
        int rows = matrix[0].length;
        for(int i =0; i<columns; i++) {
            for(int j=0; j<rows; j++) {
                if(matrix[i][j]== 0) {
                  rowIndex.add(i);
                  columnIndex.add(j);
                }
            }
        }

        for(int i =0; i<columns; i++) {
            for(int j=0; j<rows; j++) {
                if(rowIndex.contains(i)|| columnIndex.contains(j))
                   matrix[i][j] = 0;
            }
        }
      
    }


}