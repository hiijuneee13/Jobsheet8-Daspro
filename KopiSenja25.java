import java.util.Scanner;
public class KopiSenja25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nJumlah cabang kafe : ");
        int cabangCount = sc.nextInt();
        int totalKeseluruhanPelanggan = 0;
        int totalKeseluruhanItem = 0;
        System.out.print("\n=== Input Penjualan Per Cabang ===\n");
        for (int cabang = 1; cabang <= cabangCount; cabang++) {
            System.out.print("\nCabang " + cabang) ;
            System.out.print("\nJumlah pelanggan : ");
            int pelanggan = sc.nextInt();
            totalKeseluruhanPelanggan += pelanggan;
            int totalItemCabang = 0;
            for (int p = 1; p <= pelanggan; p++) {
                System.out.print("- Pelanggan " + p + " memesan beberapa item? ");
                int item = sc.nextInt();
                if (item < 0) item = 0;
                totalItemCabang += item;
            }
            totalKeseluruhanItem += totalItemCabang;
            System.out.printf("Cabang %d: \n- Pelanggan : %d, \n- Total item : %d%n",
                    cabang, pelanggan, totalItemCabang);
            System.out.println();
        }
        System.out.println("Total keseluruhan cabang:");
        System.out.println("Pelanggan : " + totalKeseluruhanPelanggan);
        System.out.println("Item terjual : " + totalKeseluruhanItem);
        sc.close();
    }
}
