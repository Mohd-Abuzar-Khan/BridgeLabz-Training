// Create MatrixAdvanced class for advanced matrix operations
public class MatrixExtends {

	// Method to create a random matrix
	public static double[][] createMatrix(int rows, int cols) {
		double[][] matrix = new double[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = (int)(Math.random() * 10) + 1;
			}
		}
		return matrix;
	}

	// Method to display a matrix
	public static void displayMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// Method to find transpose of a matrix
	public static double[][] transposeMatrix(double[][] matrix) {
		double[][] transpose = new double[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		return transpose;
	}

	// Method to find determinant of 2x2 matrix
	public static double determinant2x2(double[][] matrix) {
		return (matrix[0][0] * matrix[1][1])
			 - (matrix[0][1] * matrix[1][0]);
	}

	// Method to find determinant of 3x3 matrix
	public static double determinant3x3(double[][] m) {
		return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
			 - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
			 + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
	}

	// Method to find inverse of 2x2 matrix
	public static double[][] inverse2x2(double[][] matrix) {
		double det = determinant2x2(matrix);
		if (det == 0) {
			return null;
		}
		double[][] inverse = new double[2][2];
		inverse[0][0] =  matrix[1][1] / det;
		inverse[0][1] = -matrix[0][1] / det;
		inverse[1][0] = -matrix[1][0] / det;
		inverse[1][1] =  matrix[0][0] / det;
		return inverse;
	}

	// Method to find inverse of 3x3 matrix
	public static double[][] inverse3x3(double[][] m) {
		double det = determinant3x3(m);
		if (det == 0) {
			return null;
		}
		double[][] inverse = new double[3][3];

		inverse[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
		inverse[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
		inverse[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

		inverse[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
		inverse[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
		inverse[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

		inverse[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
		inverse[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
		inverse[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

		return inverse;
	}

	public static void main(String[] args) {
		
		System.out.println("2x2 Matrix:");
		double[][] matrix2x2 = createMatrix(2, 2);
		displayMatrix(matrix2x2);

		double det2 = determinant2x2(matrix2x2);
		System.out.println("Determinant (2x2): " + det2);

		double[][] inv2 = inverse2x2(matrix2x2);
		if (inv2 != null) {
			System.out.println("Inverse (2x2):");
			displayMatrix(inv2);
		} else {
			System.out.println("Inverse does not exist for 2x2 matrix");
		}

		// Operations in 3x3 matrix
		System.out.println("\n3x3 Matrix:");
		double[][] matrix3x3 = createMatrix(3, 3);
		displayMatrix(matrix3x3);

		double det3 = determinant3x3(matrix3x3);
		System.out.println("Determinant (3x3): " + det3);

		double[][] inv3 = inverse3x3(matrix3x3);
		if (inv3 != null) {
			System.out.println("Inverse (3x3):");
			displayMatrix(inv3);
		} else {
			System.out.println("Inverse does not exist for 3x3 matrix");
		}

		// Transpose of matrix
		System.out.println("\nTranspose of 3x3 Matrix:");
		double[][] transpose = transposeMatrix(matrix3x3);
		displayMatrix(transpose);
	}
}