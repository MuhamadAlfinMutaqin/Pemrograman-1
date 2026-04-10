import java.util.Scanner;

public class Pengembangan_Tugas1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            int panjang, lebar;

            while (true) {
                System.out.print("Masukkan panjang: ");
                if (!input.hasNextInt()) {
                    System.out.println("Harus angka!");
                    input.next();
                    continue;
                }
                panjang = input.nextInt();

                System.out.print("Masukkan lebar: ");
                if (!input.hasNextInt()) {
                    System.out.println("Harus angka!");
                    input.next();
                    continue;
                }
                lebar = input.nextInt();

                if (panjang > 0 && lebar > 0) break;

                System.out.println("Input harus > 0");
            }

            int luas = hitungLuas(panjang, lebar);
            int keliling = hitungKeliling(panjang, lebar);

            System.out.println("\n=== HASIL ===");
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);

            System.out.print("Ulangi? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        input.close();
    }

    public static int hitungLuas(int p, int l) {
        return p * l;
    }

    public static int hitungKeliling(int p, int l) {
        return 2 * (p + l);
    }
}