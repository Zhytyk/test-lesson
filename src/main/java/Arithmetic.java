import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Arithmetic implements IArithmetic {
    public double countFormula2(double x, double y) {

        return ( Math.abs(x) - Math.abs(y) ) / ( 1 + Math.abs(x * y) );
    }

    public String countFormula4(double x, double y) {
        String result = "";
        result += ((x + y) / 2);
        result += " ";
        result += Math.sqrt(x * y);

        return result;
    }

    public String countFormula6(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("No negative values");
        }

        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        otherSymbols.setDecimalSeparator('.');
        otherSymbols.setGroupingSeparator('.');

        DecimalFormat format = new DecimalFormat("#.00", otherSymbols);
        String result = "";

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double p = (a + b + c) / 2;

        result += format.format(c);
        result += " ";
        result += format.format(Math.sqrt(p * (p - a) * (p - b) * (p - c)));

        return result;
    }
}
