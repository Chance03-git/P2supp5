public class MagicSquare2 {
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