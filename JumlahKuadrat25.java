import java.util.Scanner;
public class JumlahKuadrat25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            int kuadrat = 0;
            for (int k = 1; k <= i; k++) {
                kuadrat += i;
            }
            total += kuadrat;
            System.out.printf("i = %d, i^2 = %d, jumlah sementara = %d%n", i, kuadrat, total);
        }
        System.out.println("Jumlah kuadrat 1 s.d " + n + " = " + total);
        sc.close();
    }
}
