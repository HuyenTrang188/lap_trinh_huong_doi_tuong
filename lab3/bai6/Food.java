package lab3.bai6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food extends Product {
    private LocalDate expiryDate;

    public Food(String name, double basePrice,
                LocalDate expiryDate) {
        super("F", name, basePrice);
        this.expiryDate = expiryDate;
    }

    @Override
    public double getFinalPrice() {
        long days = ChronoUnit.DAYS.between(
            LocalDate.now(), expiryDate
        );

        if (days >= 0 && days < 7) {
            return basePrice * 0.8;
        }

        else if (days <0) return 0;

        return basePrice;
    }
}
