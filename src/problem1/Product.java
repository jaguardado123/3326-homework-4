package problem1;

public class Product {

    private String [] promo_codes = {"ASD-123", "QWE-456", "ZXC-789", "JKL-147"};

    public double cost(double price) {
        return price;
    }

    // Overload cost() to receive a price (double) and discount_percent (double)
    // Return price - total_discount


    // Overload cost() to receive a price (double) and promo_code (String)
    // Return price / 2 if a valid promo_code is given.
    // Otherwise return full price


}