package Matric;

public class Matrix2SInicial {
    public int a1;
    public int a2;
    public int a3;
    public int a4;

    double massivee[][] = new double[2][2];

    public Matrix2SInicial(int a, int b, int c, int d) {
        this.a1=a;
        this.a2=b;
        this.a3=c;
        this.a4=d;

        massivee[0][0] = a;
        massivee[0][1] = b;
        massivee[1][0] = c;
        massivee[1][1] = d;
    }

    public double getValue(int i, int j) {
        return massivee[i][j];
    }
    public double[][] plus(Matrix2SInicial matrixx) {
        double[][] newMas = new double[2][2];
        for(int i = 0; i<2; ++i)
            for(int j = 0; j<2; ++j)
                newMas[i][j] = massivee[i][j] + matrixx.getValue(i,j);
        double[][] v = newMas;
        return v;
    }
    public double[][] min(Matrix2SInicial matrixx) {
        double[][] newMas = new double[2][2];
        for(int i = 0; i<2; ++i)
            for(int j = 0; j<2; ++j)
                newMas[i][j] = massivee[i][j] - matrixx.getValue(i,j);
        double[][] v = newMas;
        return v;
    }
    public double[][] transPon() {
        double[][] newMas = new double[2][2];
        for(int i = 0; i<2; ++i)
            for(int j = 0; j<2; ++j)
                newMas[i][j] = massivee[j][i];
        double[][] v = newMas;
        return v;
    }

    public String toString() {
        return massivee[0][0] + "," + massivee[0][1]+"\n"
                + massivee[1][0] + "," + massivee[1][1]+"\n";
    }
    public double opredel() {
        double opr;
        opr = massivee[0][0] * massivee[1][1] - massivee[1][0] * massivee[0][1];
        return opr;
    }

    public Matrix2 umnog(Matrix2 newMatr2) {
        double[][] newMas = new double[2][2];
        newMas[0][0] = massivee[0][0] * newMatr2.getValue(0,0) + massivee[0][1] * newMatr2.getValue(1,0);
        newMas[0][1] = massivee[0][0] * newMatr2.getValue(0,1) + massivee[0][1] * newMatr2.getValue(1,1);
        newMas[1][0] = massivee[1][0] * newMatr2.getValue(0,0) + massivee[1][1] * newMatr2.getValue(1,0);
        newMas[1][1] = massivee[1][0] * newMatr2.getValue(0,1) + massivee[1][1] * newMatr2.getValue(1,1);
        Matrix2 n = new Matrix2(newMas);
        return n;
    }
}
