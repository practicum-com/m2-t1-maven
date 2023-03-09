package com.practicum.calculators;

import com.practicum.calculators.types.Calculator;
import com.practicum.exceptions.IncorrectDiscountException;

public class CalculatorsFactory {
    public static DiscountCalculator makeNewDiscount(
        final int discount
    ) throws IncorrectDiscountException {
        return new DiscountCalculator(discount);
    }

    public static SaleCalculator makeNewSale(
        final int discount
    ) throws IncorrectDiscountException {
        return new SaleCalculator(discount);
    }

    public static Calculator makeNewCalculator(
        final PriceCalculator calculator, final String name
    ) {
        return new Calculator(calculator, name);
    }
}
