package P4_muhamadalfin.sourcePackage.Latihan;
import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //variable
        float makan, transport, belanja, total;
        float persenMakan, persenTransportasi, persenBelanja;

        //S1//
        System.out.println("masukan biaya makan: Rp ");
        makan = input.nextFloat();
        System.out.println("masukan biaya transportasi: Rp" );
        transport = input.nextFloat();
        System.out.println("masukan biaya belanja: Rp");
        belanja = input.nextFloat();

        //P1//
        total = makan + transport + belanja;
        persenMakan = (makan/total) *100;
        persenTransportasi = (transport/total) *100;
        persenBelanja = (belanja/total) *100;

        //S2


    }
    
}
