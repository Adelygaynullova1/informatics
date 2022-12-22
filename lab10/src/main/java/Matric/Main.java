package Matric;
import java.util.Arrays;



public class Main {
        public static void main(String ... args) {
            Matrix2 mr = new Matrix2(new double[][]{{2,3},{1,2}});
            Matrix2 mr1 = new Matrix2(new double[][]{{9,5},{3,7}});
            System.out.println(mr.plus(mr1));
            System.out.println(mr.min(mr1));
            System.out.println(mr.transPon());
            System.out.println(mr.opredel());
            System.out.println(mr.umnog(mr1));

            Matrix2SInicial m2i = new Matrix2SInicial(1,2,3,4);
            Matrix2SInicial m3i = new Matrix2SInicial(5,6,7,8);
            System.out.println(Arrays.deepToString(m2i.plus(m3i)));
            System.out.println(Arrays.deepToString(m2i.min(m3i)));
            System.out.println(Arrays.deepToString(m2i.transPon()));
            System.out.println(Arrays.deepToString(m2i.transPon()));
            System.out.println(Arrays.deepToString(m2i.transPon()));



        }


}
