import java.util.Scanner;

public class ArrayNilai28 {
    public static void main(String[] args) {

        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);
        
        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ":");
            nilaiAkhir[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilaiAkhir[i] + " (" + status + ")");

            if (nilaiAkhir[i] > 70) {
                jmlLulus++;
            } else {
                jmlTidakLulus++;
            }
        }

        System.out.println("Jumlah mahasiswa yang lulus: "+jmlLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: "+jmlTidakLulus);

        input.close();

    }
}