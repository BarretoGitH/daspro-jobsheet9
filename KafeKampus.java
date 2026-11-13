import java.util.Scanner;
public class KafeKampus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("    DAFTAR MENU KAFE KAMPUS    ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " = Rp " + harga[i]);
        }
        System.out.println();

        System.out.print("Masukkan nama menu yang dicari: ");
        String cariMenu = scanner.nextLine();
        boolean ditemukan = false;
        int indeksHarga = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                ditemukan = true;
                indeksHarga = i;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Menu \"" + menu[indeksHarga] + "\" tersedia - harga Rp " + harga[indeksHarga]);
        } else {
            System.out.println("Mohon maaf, menu \"" + cariMenu + "\" tidak tersedia");
        }

        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine();

        String[] pesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            boolean menuValid = false;
            String namaPesananInput;

            do {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                namaPesananInput = scanner.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesananInput)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        totalBiaya += harga[j];
                        menuValid = true;
                        break;
                    }
                }

                if (!menuValid) {
                    System.out.println("Menu \"" + namaPesananInput + "\" tidak tersedia! Silakan masukkan ulang.");
                }
            } while (!menuValid);
        }

        System.out.println("       DAFTAR PESANAN ANDA       ");
 
        System.out.println(String.format("%-20s | %-10s", "Nama Menu", "Harga"));

        for (int i = 0; i < pesanan.length; i++) {
            System.out.println(String.format("%-20s | Rp %-7d", pesanan[i], hargaPesanan[i]));
        }
        System.out.println("Total Biaya : Rp " + totalBiaya);
        scanner.close();
    }
}