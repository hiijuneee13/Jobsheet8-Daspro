import java.util.Scanner;
public class NilaiKelompok25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int JUMLAH_KELOMPOK = 6;
        int PENILAI_PER_KELOMPOK = 5;
        int i = 1;
        double rataNilai, totalNilai;
        double highestRata = 0;
        int nomorKelompokTertinggi = 0;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Nilai dari Kelompok Penilai " + j + " = ");
                double nilai = sc.nextDouble();
                if (nilai < 0) nilai = 0;
                if (nilai > 100) nilai = 100;
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.printf("Rata-rata kelompok %d = %.2f%n", i, rataNilai);
            if (rataNilai > highestRata) {
                highestRata = rataNilai;
                nomorKelompokTertinggi = i;
            }
            i++;
            System.out.println();
        }
        System.out.printf("Kelompok dengan rata-rata tertinggi: %d (%.2f)%n",
                nomorKelompokTertinggi, highestRata);
        sc.close();
    }
}
