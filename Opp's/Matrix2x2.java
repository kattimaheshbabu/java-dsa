// Matrix 2x2 Operations
// This class demonstrates basic 2x2 matrix operations

public class Matrix2x2 {
    private int[][] matrix;
    
    // Constructor - initialize 2x2 matrix
    public Matrix2x2(int[][] data) {
        if (data.length == 2 && data[0].length == 2) {
            this.matrix = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    this.matrix[i][j] = data[i][j];
                }
            }
        } else {
            throw new IllegalArgumentException("Matrix must be 2x2");
        }
    }
    
    // Display the matrix
    public void display() {
        System.out.println("Matrix:");
        for (int i = 0; i < 2; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
        }
    }
    
    // Add two matrices
    public Matrix2x2 add(Matrix2x2 other) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
        return new Matrix2x2(result);
    }
    
    // Subtract two matrices
    public Matrix2x2 subtract(Matrix2x2 other) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = this.matrix[i][j] - other.matrix[i][j];
            }
        }
        return new Matrix2x2(result);
    }
    
    // Multiply two matrices
    public Matrix2x2 multiply(Matrix2x2 other) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        return new Matrix2x2(result);
    }
    
    // Calculate determinant of 2x2 matrix
    // For matrix [[a, b], [c, d]], determinant = (a*d) - (b*c)
    public int determinant() {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }
    
    // Transpose the matrix
    public Matrix2x2 transpose() {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return new Matrix2x2(result);
    }
    
    // Multiply matrix by a scalar
    public Matrix2x2 scalarMultiply(int scalar) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        return new Matrix2x2(result);
    }
    
    public static void main(String[] args) {
        // Create two 2x2 matrices
        int[][] data1 = {{1, 2}, {3, 4}};
        int[][] data2 = {{5, 6}, {7, 8}};
        
        Matrix2x2 mat1 = new Matrix2x2(data1);
        Matrix2x2 mat2 = new Matrix2x2(data2);
        
        System.out.println("Matrix 1:");
        mat1.display();
        
        System.out.println("\nMatrix 2:");
        mat2.display();
        
        // Addition
        System.out.println("\nAddition (Matrix1 + Matrix2):");
        Matrix2x2 sum = mat1.add(mat2);
        sum.display();
        
        // Subtraction
        System.out.println("\nSubtraction (Matrix1 - Matrix2):");
        Matrix2x2 diff = mat1.subtract(mat2);
        diff.display();
        
        // Multiplication
        System.out.println("\nMultiplication (Matrix1 × Matrix2):");
        Matrix2x2 product = mat1.multiply(mat2);
        product.display();
        
        // Determinant
        System.out.println("\nDeterminant of Matrix1: " + mat1.determinant());
        System.out.println("Determinant of Matrix2: " + mat2.determinant());
        
        // Transpose
        System.out.println("\nTranspose of Matrix1:");
        Matrix2x2 transpose = mat1.transpose();
        transpose.display();
        
        // Scalar Multiplication
        System.out.println("\nScalar Multiplication (Matrix1 × 2):");
        Matrix2x2 scalar = mat1.scalarMultiply(2);
        scalar.display();
    }
}
