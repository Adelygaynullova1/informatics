package Matric;

public class Matrix2 extends MatrixN {


    public Matrix2(double[][] matrixx) {
        super(matrixx, 2, 2);
    }

    public double opredel() {
        double opr;
        opr = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        return opr;
    }

    public Matrix2 umnog(Matrix2 newMatr2) {
        double[][] newMas = new double[2][2];
        newMas[0][0] = matrix[0][0] * newMatr2.getValue(0,0) + matrix[0][1] * newMatr2.getValue(1,0);
        newMas[0][1] = matrix[0][0] * newMatr2.getValue(0,1) + matrix[0][1] * newMatr2.getValue(1,1);
        newMas[1][0] = matrix[1][0] * newMatr2.getValue(0,0) + matrix[1][1] * newMatr2.getValue(1,0);
        newMas[1][1] = matrix[1][0] * newMatr2.getValue(0,1) + matrix[1][1] * newMatr2.getValue(1,1);
        Matrix2 n = new Matrix2(newMas);
        return n;
    }

}
