import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variabel
        int panjang;
        int lebar;
        int luas;

        // ===== S1 (Input) =====
        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();

        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();

        // ===== P1 (Proses) =====
        luas = panjang * lebar;

        // ===== P2 (Output) =====
        System.out.println("\n=== HASIL ===");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + luas);

        input.close();
    }
}