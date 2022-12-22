package ru.itis.informatics.lab07.model;

public class Matrix2 {
    private double[][] matrix; // поле

    // Конструктор без аргументов
    public Matrix2() {
        matrix = new double[2][2];
        for(int i = 0; i < 2; ++i)
            for(int j = 0; j < 2; ++j)
                matrix[i][j] = 0;
    }

    // Конструктор c аргументом - массивом
    public Matrix2(double[][] m) {
        matrix = new double[2][2];
        for(int i = 0; i < 2; ++i)
            for(int j = 0; j < 2; ++j)
                matrix[i][j] = m[i][j];
    }

    public String toString() {
        return "[" + matrix[0][0] + ","+ matrix[0][1] + ","
                + matrix[1][0] + ","+ matrix[1][1] + "]";
    }

    public void setValue(int i, int j, double v) {
        matrix[i][j] = v;
    }

    public double getValue(int i, int j) {
        return matrix[i][j];
    }

    public Matrix2 plus(Matrix2 arg2) {
        double[][] c_array = new double[2][2];
        for(int i = 0; i < 2; ++i)
            for(int j = 0; j < 2; ++j)
                c_array[i][j] = matrix[i][j] + arg2.getValue(i,j);

        Matrix2 c = new Matrix2(c_array);
        return c;
    }
}
