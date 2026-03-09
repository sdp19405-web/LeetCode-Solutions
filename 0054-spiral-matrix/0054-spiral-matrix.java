import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // top
            for (int i = startCol; i <= endCol; i++) {
                result.add(matrix[startRow][i]);
            }

            // right
            for (int j = startRow + 1; j <= endRow; j++) {
                result.add(matrix[j][endCol]);
            }

            // bottom
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    result.add(matrix[endRow][i]);
                }
            }

            // left
            if (startCol < endCol) {
                for (int j = endRow - 1; j > startRow; j--) {
                    result.add(matrix[j][startCol]);
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return result;
    }
}
