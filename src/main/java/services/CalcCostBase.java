package services;

import models.Product;

public abstract class CalcCostBase {
    public static double calculate(Product product) {
        return product.getBaseCost();
    }
}