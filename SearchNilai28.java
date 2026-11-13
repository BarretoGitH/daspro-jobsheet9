import java.util.Scanner;
public class SearchNilai28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen yang akan diinput: ");
        int jmlElemen = input.nextInt();

        int nilai[] = new int[jmlElemen];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan Nilai Mahasiswa ke- " + (i + 1) + " :");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();

        int indeksDitemukan = -1;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                indeksDitemukan = i;
                break;
            }
        }

        if (indeksDitemukan != -1) {
            System.out.println("Hasil Pencarian: Nilai " + key + " BERHASIL ditemukan pada indeks ke-" + indeksDitemukan);
        } else {
            System.out.println("Hasil Pencarian: Nilai " + key + " TIDAK DITEMUKAN dalam daftar nilai mahasiswa yang dimasukkan.");
        }

        input.close();
    }
}