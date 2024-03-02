package model.services;

public class PaypalService implements OnlinePaymentService {
    @Override
    public double paymentFee(double amount) {
        return amount * 1.02;
    }

    @Override
    public double interest(double amount, int month) {
        return amount * (0.01 * month);
    }
}