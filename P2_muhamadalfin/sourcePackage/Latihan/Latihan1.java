import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input nama: ");
        String nama = input.nextLine();

        System.out.print("Input usia: ");
        int usia = input.nextInt();

        System.out.println("\n=== HASIL ===");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);

        input.close();
    }
}