/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String grade;
        
        System.out.print("Input kehadiran: ");
        int absen = input.nextInt();
        
        System.out.print("Input Total: ");
        int total = input.nextInt();
        
        float validasi = 21 * 0.75f; // 75% dari 21
        
        // Penentuan grade berdasarkan nilai
        if(total >= 80){
            grade = "A";
        }else if(total >= 70){
            grade = "B";
        }else if(total >= 60){
            grade = "C";
        }else if(total >= 55){
            grade = "D";
        }else{
            grade = "E";
        }
        
        // Logika kelulusan
        if (absen >= validasi){
            System.out.println("Total: " + total + " & Grade: " + grade);
            if(total >= 55){
                System.out.println("Kamu lulus");
            }else{
                System.out.println("Kamu tidak lulus");
            }
        }else{
            if(total >= 55){
                grade = "D";
            }else{
                grade = "E";
            }
            System.out.println("Kamu mendapatkan Grade: " + grade);
            System.out.println("Kamu tidak lulus karena kehadiran kurang");
        }
        
        input.close();
    }
}
