package P5_muhamadalfin.sourcePackage.Latihan;

import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalPertemuan = 21;

        // Hitung minimal kehadiran 75%
        int minimalHadir = (int) Math.ceil(0.75 * totalPertemuan);

        // Input
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.print("Masukkan jumlah kehadiran: ");
        int hadir = input.nextInt();

        char grade;

        // Jika kehadiran >= 75%
        if (hadir >= minimalHadir) {

            if (nilai >= 80) {
                grade = 'A';
            } else if (nilai >= 70) {
                grade = 'B';
            } else if (nilai >= 60) {
                grade = 'C';
            } else if (nilai >= 50) {
                grade = 'D';
            } else {
                grade = 'E';
            }

        } else {
            // Jika kehadiran < 75%
            if (nilai >= 55) {
                grade = 'D';
            } else {
                grade = 'E';
            }
        }

        // Output
        System.out.println("Nilai: " + nilai);
        System.out.println("Kehadiran: " + hadir + " / " + totalPertemuan);
        System.out.println("Grade: " + grade);

        input.close();
    }
}