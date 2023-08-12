import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рядків (M): ");
        int M = scanner.nextInt();

        System.out.print("Введіть кількість стовпців (N): ");
        int N = scanner.nextInt();

        int[][] matrix = new int[M][N];

        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transposedMatrix = transposeMatrix(matrix);

        int[][] secondMatrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                secondMatrix[i][j] = transposedMatrix[i][j];
            }
        }

        System.out.println("Матриця M x N:");
        printMatrix(matrix);

        System.out.println("Матриця N x M:");
        printMatrix(secondMatrix);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        int[][] transposed = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }

        return transposed;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
