import java.util.Scanner;

public class pengelolaNilaiMhs {
    public static void main(String[] args) {

        System.out.print("Masukkan jumlah mahasiswa: ");
        Scanner input = new Scanner(System.in);

        int elements = input.nextInt();
        int[] nilaiMhs = new int[elements];

        int total = 0;
        double rata2;
        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + " :");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jmlLulus++;
            }else{
                jmlTidakLulus++;
            }
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Total seluruh nilai mahasiswa: " + total);
        System.out.println("Rata rata seluruh nilai mahsiswa: " + rata2);

        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerRendah = nilaiMhs[0];

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
            }
            nilaiTertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < nilaiTerRendah) {
            nilaiTerRendah = nilaiMhs[i];
            }
        }
        
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerRendah);

        System.out.println("jumlah mahasiswa yang tidak lulus: "+jmlLulus+" orang");
        System.out.println("jumlah mahasiswa yang tidak lulus: "+ jmlTidakLulus+" orang");
        
        
    input.close();
    }
}