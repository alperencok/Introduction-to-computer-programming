package Examples;

public class Example024{
    public static int[] satisToplamHesapla(int [][] matrix){

        int markaToplam[] = new int[matrix.length];
        for(int i=0; i<matrix.length; i++){
            int toplam=0;
            for(int j=0; j<matrix[i].length; j++){
                toplam+=matrix[i][j];
            }
            markaToplam[i]=toplam;
        }
        return markaToplam;

    }
    public static void main(String[] args) {
        int[][] matrix={{700,600,650},{900,800,700},{300,400,350},{500,450,470},{600,500,480}};

        String[] markalar={"Fiat","Renault","VW","Opel","Ford"};
        String[] aylar={"Ocak","Subat","Mart"};

        int[] markaToplamSatislari=satisToplamHesapla(matrix);

        for(int i=0; i<markaToplamSatislari.length; i++){
            System.out.println(markalar[i] + ": " + markaToplamSatislari[i]);
        }
    }
}
