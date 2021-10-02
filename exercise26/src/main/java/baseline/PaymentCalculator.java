package baseline;

public class PaymentCalculator extends Solution26 {
    public static void calculateMonthsUntilPaidOff(){
        //user apr / 365
        //set int equal to (int) Math.ceil(-(1/30) * Math.log(1 + balance/payment * (1 - Math.pow(1 + apr,30))) / Math.log(1 + apr))
    }
}
