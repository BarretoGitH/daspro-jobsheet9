import java.util.Scanner;

public class ArrayRataNilai28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa");

        int elements = input.nextInt();
        int[] nilaiMhs = new int[elements];

        int total = 0;
        double rata2;
        int jmlLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jmlLulus++;
            }
        }

        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        System.out.print("Predikat kelas: ");
        if (rata2 >= 85) {
            System.out.println("SANGAT BAIK");
        } else if (rata2 >= 70) {
            System.out.println("BAIK");
        } else {
            System.out.println("PERLU PENDAMPINGAN");
        }
        System.out.println("Jumlah mahasiswa yang lulus: " + jmlLulus + " orang");
        input.close();
    }
}