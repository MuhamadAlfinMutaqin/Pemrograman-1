package P4_muhamadalfin.sourcePackage.Latihan;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //variable
        float realisasi, kehadiran, tugas, uts, uas;
        float b_kehadiran, b_tugas, b_uts, b_uas, total;

        //S1 - Input data
        System.out.print("Input realisasi (total pertemuan): ");
        realisasi = input.nextFloat();

        System.out.print("Input kehadiran: ");
        kehadiran = input.nextFloat();

        System.out.print("Input nilai tugas: ");
        tugas = input.nextFloat();

        System.out.print("Input nilai UTS: ");
        uts = input.nextFloat();

        System.out.print("Input nilai UAS: ");
        uas = input.nextFloat();

        //P1 - Perhitungan bobot
        b_kehadiran = (kehadiran / realisasi) * 10;
        b_tugas = tugas * 20 / 100;
        b_uts = uts * 30 / 100;
        b_uas = uas * 40 / 100;
        total = b_kehadiran + b_tugas + b_uts + b_uas;

        //S2 - Output hasil

        System.out.println("Kehadiran: " + kehadiran + " dari " + realisasi + " pertemuan");
        System.out.println("Nilai Kehadiran: " + b_kehadiran);
        System.out.println("Nilai Tugas: " + b_tugas);
        System.out.println("Nilai UTS: " + b_uts);
        System.out.println("Nilai UAS: " + b_uas);
        System.out.println("Nilai Total: " + total);
        
        input.close();
    }
}