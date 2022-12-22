package Matric;

public class MatrixN {
    public double[][] matrix;

    public int m;
    public int n;

    public MatrixN(double[][] matrix1,int m1,int n1) {
        this.m = m1;
        this.n = n1;
        matrix = new double[m][n];
        for(int i = 0; i<m; ++i)
            for(int j = 0; j<n; ++j)
                matrix[i][j] = matrix1[i][j];

    }
    public double getValue(int i, int j) {
        return matrix[i][j];
    }
    public MatrixN plus(MatrixN matrixx) {
        double[][] newMas = new double[m][n];
        for(int i = 0; i<m; ++i)
            for(int j = 0; j<n; ++j)
                newMas[i][j] = matrix[i][j] + matrixx.getValue(i,j);
        MatrixN v = new MatrixN(newMas,m,n);
        return v;
    }
    public MatrixN min(MatrixN matrixx) {
        double[][] newMas = new double[m][n];
        for(int i = 0; i<m; ++i)
            for(int j = 0; j<n; ++j)
                newMas[i][j] = matrix[i][j] - matrixx.getValue(i,j);
        MatrixN v = new MatrixN(newMas,m,n);
        return v;
    }
    public MatrixN transPon() {
        double[][] newMas = new double[m][n];
        for(int i = 0; i<m; ++i)
            for(int j = 0; j<n; ++j)
                newMas[i][j] = matrix[j][i];
        MatrixN v = new MatrixN(newMas,m,n);
        return v;
    }

    public String toString() {
        return matrix[0][0] + "," + matrix[0][1]+"\n"
                + matrix[1][0] + "," + matrix[1][1]+"\n";
    }
}
