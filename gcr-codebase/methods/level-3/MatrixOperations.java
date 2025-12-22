// Create MatrixOperations class for matrix calculations
public class MatrixOperations {

	// Method to create random matrix
	public static int[][] createMatrix(int rows, int cols) {
		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = (int)(Math.random() * 10);
			}
		}
		return matrix;
	}

	// Method to add two matrices
	public static int[][] addMatrix(int[][] a, int[][] b) {
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}

	// Method to subtract two matrices
	public static int[][] subtractMatrix(int[][] a, int[][] b) {
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		return result;
	}

	// Method to multiply two matrices
	public static int[][] multiplyMatrix(int[][] a, int[][] b) {
		int[][] result = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}

	// Method to display a matrix
	public static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int rows = 3;
		int cols = 3;

		// Create two random matrices
		int[][] matrixA = createMatrix(rows, cols);
		int[][] matrixB = createMatrix(rows, cols);
		System.out.println("Matrix A:");
		displayMatrix(matrixA);
		System.out.println("\nMatrix B:");
		displayMatrix(matrixB);

		// Matrix Addition
		System.out.println("\nAddition of Matrices:");
		int[][] addition = addMatrix(matrixA, matrixB);
		displayMatrix(addition);

		// Matrix Subtraction
		System.out.println("\nSubtraction of Matrices:");
		int[][] subtraction = subtractMatrix(matrixA, matrixB);
		displayMatrix(subtraction);

		// Matrix Multiplication
		System.out.println("\nMultiplication of Matrices:");
		int[][] multiplication = multiplyMatrix(matrixA, matrixB);
		displayMatrix(multiplication);
	}
}