import java.text.*;
import java.util.*;

public class FormatAngkaLokal {
    public static void main(String[] args) {

        double Angka = 83243463.342245;
        double AngkaPecahan = 0.902235643;

        NumberFormat numberFormatter = NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat currFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat percentFormatter = NumberFormat.getPercentInstance(Locale.GERMANY);

        System.out.println("Number (Jerman): " + numberFormatter.format(Angka));
        System.out.println("Currency (Jerman): " + currFormatter.format(Angka));
        System.out.println("Percent (Jerman): " + percentFormatter.format(AngkaPecahan));
    }
}