package P5_muhamadalfin.sourcePackage.Latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String BacaInput = "";
        Byte JmlData = 0;
        Byte DataArray[];

        System.out.print("Jumlah data : ");
        try {
            BacaInput = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada kesalahan !");
        }

        JmlData = Byte.parseByte(BacaInput);
        DataArray = new Byte[JmlData];

        // Membaca data dari keyboard
        System.out.println();
        for (Byte i = 0; i < JmlData; i++) {
            System.out.print("DataArray[" + i + "] = ");
            try {
                BacaInput = dataIn.readLine();
            } catch (IOException e) {
                System.out.println("Ada kesalahan !");
            }
            DataArray[i] = Byte.parseByte(BacaInput);
        }

        // Menampilkan data dari array
        System.out.println();
        for (Byte i = 0; i < JmlData; i++) {
            System.out.println("DataArray[" + i + "] = " + DataArray[i]);
        }

        // =========================
        // Mencari nilai max & min
        // =========================
        Byte max = DataArray[0];
        Byte min = DataArray[0];

        for (Byte i = 1; i < JmlData; i++) {
            if (DataArray[i] > max) {
                max = DataArray[i];
            }
            if (DataArray[i] < min) {
                min = DataArray[i];
            }
        }

        System.out.println("\nNilai Maksimal = " + max);
        System.out.println("Nilai Minimal  = " + min);

        // =========================
        // Sorting (Bubble Sort)
        // =========================
        for (Byte i = 0; i < JmlData - 1; i++) {
            for (Byte j = 0; j < JmlData - i - 1; j++) {
                if (DataArray[j] > DataArray[j + 1]) {
                    Byte temp = DataArray[j];
                    DataArray[j] = DataArray[j + 1];
                    DataArray[j + 1] = temp;
                }
            }
        }

        // Menampilkan hasil sorting
        System.out.println("\nData setelah diurutkan:");
        for (Byte i = 0; i < JmlData; i++) {
            System.out.println("DataArray[" + i + "] = " + DataArray[i]);
        }
    }
}
