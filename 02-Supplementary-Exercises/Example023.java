package Examples;

public class Example023 {

    public static double genelOrt(int[][] matrix, double[] isciOrt){

        double genelOrtalama = 0;
        double isciOrtalama = 0;

        for (int satir = 0; satir < matrix.length; satir++) {
            isciOrtalama = 0;
            for (int sutun = 0; sutun < matrix[satir].length; sutun++) {
                isciOrtalama += matrix[satir][sutun];
            }
            isciOrtalama = isciOrtalama / matrix[satir].length;
            isciOrt[satir] = isciOrtalama;
            genelOrtalama += isciOrtalama;
        }
        genelOrtalama /= matrix.length;
        return genelOrtalama;
    }

    public static void main(String[] args) {
        int[][] haftalikSaatler=
                {{2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9},};

        double isciOrtSaatleri[] = new double[haftalikSaatler.length];

        double genelOrtSaati = genelOrt(haftalikSaatler, isciOrtSaatleri);

        System.out.println("Genel Ortalama: " + genelOrtSaati);
        for (int i = 0; i < isciOrtSaatleri.length; i++) {
            if (isciOrtSaatleri[i] > genelOrtSaati) {
                System.out.println("Employee " + (i + 1) + " ortalama ustunde calisir: " + isciOrtSaatleri[i]);
            }
        }
    }
}
