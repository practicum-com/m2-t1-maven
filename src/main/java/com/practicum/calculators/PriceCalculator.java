package com.practicum.calculators;

import com.practicum.exceptions.IncorrectFinalPriceException;

public interface PriceCalculator {
    double calculateFinalPrice(double price) throws IncorrectFinalPriceException;
}
