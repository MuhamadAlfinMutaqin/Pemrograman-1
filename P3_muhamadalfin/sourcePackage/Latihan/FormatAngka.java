import java.text.*;

public class FormatAngka {
    public static void main(String[] args) {

        double Angka = 83243463.342245;
        double AngkaPecahan = 0.902235643;

        NumberFormat numberFormatter = NumberFormat.getNumberInstance();
        NumberFormat currFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();

        String numberStr = numberFormatter.format(Angka);
        String currStr = currFormatter.format(Angka);
        String percentStr = percentFormatter.format(AngkaPecahan);

        System.out.println("Number : " + numberStr);
        System.out.println("Currency : " + currStr);
        System.out.println("Percent : " + percentStr);
    }
}