package Examples;

public class Example025 {

    public static int[] satisToplam(int[][] matrix) {
        int[] aylikToplam = new int[matrix[0].length];

        for (int sutun = 0; sutun < matrix[0].length; sutun++) {
            int toplam = 0;
            for (int satir = 0; satir < matrix.length; satir++) {
                toplam += matrix[satir][sutun];
            }
            aylikToplam[sutun] = toplam;
        }
        return aylikToplam;

    }

    public static void main(String[] args) {
        int[][] matrix = {{700, 600, 650}, {900, 800, 700}, {300, 400, 350}, {500, 450, 470}, {600, 500, 480}};

        String[] markalar = {"Fiat", "Renault", "VW", "Opel", "Ford"};
        String[] aylar = {"Ocak", "Subat", "Mart"};

        int aylikToplam[] = satisToplam(matrix);

        for (int i = 0; i < aylikToplam.length; i++) {
            System.out.println(aylar[i] + ": " + aylikToplam[i]);
        }
    }
}
