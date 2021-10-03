package baseline;

public class PaymentCalculator extends Solution26 {

    public int calculateMonthsUntilPaidOff(){
        Solution26 calc = new Solution26();
        //user apr / 365
        calc.apr = calc.apr/365;
        //set int equal to (int) Math.ceil(-(1/30) * Math.log(1 + balance/payment * (1 - Math.pow(1 + apr,30))) / Math.log(1 + apr))
        int months = (int) Math.ceil((-1 / 30.0) * Math.log(1 + balance / payment * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));
        return months;
    }
}
