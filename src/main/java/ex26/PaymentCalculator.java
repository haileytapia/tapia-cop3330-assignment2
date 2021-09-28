package ex26;
import java.lang.Math;

public class PaymentCalculator
{
    public static double calculateMonthsUntilPaidOff(double balance, double APR, double monthlyPay)
    {
        APR /= 365.0;
        double months = (-1.0/30.0) * Math.log(1 + ((balance/monthlyPay * 1.0) * (1 - (Math.pow((1 + APR), 30))))) / Math.log(1 + APR);

        return months;
    }
}