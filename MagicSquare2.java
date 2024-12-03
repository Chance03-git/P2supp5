public class MagicSquare2 {
// Static method to determine if a 2D matrix is a magic square
public static boolean isMagicSquare(int[][] matrix) {
    // Check if the matrix is square (rows == columns)
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
        if (matrix[i].length != n) {
            return false;  // Not a square matrix
        }
    }

    // Calculate the sum of the first row to use as reference
    int targetSum = 0;
    for (int i = 0; i < n; i++) {
        targetSum += matrix[0][i];
    }

    // Check the sum of all rows
    for (int i = 1; i < n; i++) {
        int rowSum = 0;
        for (int j = 0; j < n; j++) {
            rowSum += matrix[i][j];
        }
        if (rowSum != targetSum) {
            return false;  // Row sum does not match the target sum
        }
    }

    // Check the sum of all columns
    for (int i = 0; i < n; i++) {
        int colSum = 0;
        for (int j = 0; j < n; j++) {
            colSum += matrix[j][i];
        }
        if (colSum != targetSum) {
            return false;  // Column sum does not match the target sum
        }
    }

    // Check the sum of the main diagonal
    int mainDiagonalSum = 0;
    for (int i = 0; i < n; i++) {
        mainDiagonalSum += matrix[i][i];
    }
    if (mainDiagonalSum != targetSum) {
        return false;  // Main diagonal sum does not match the target sum
    }

    // Check the sum of the anti-diagonal
    int antiDiagonalSum = 0;
    for (int i = 0; i < n; i++) {
        antiDiagonalSum += matrix[i][n - 1 - i];
    }
    // If all checks passed, it's a magic square
    return antiDiagonalSum == targetSum;
}
    // Test the method
    public static void main(String[] args) {
        int[][] magicMatrix = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        int[][] nonMagicMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Is magic square (magicMatrix): " + isMagicSquare(magicMatrix)); // true
        System.out.println("Is magic square (nonMagicMatrix): " + isMagicSquare(nonMagicMatrix)); // false
    }
}