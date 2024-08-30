package services;

import models.Product;

public class CalcCostBase {
    public static double calculate(Product product) {
        return product.getBaseCost();
    }

    public static double calculate(double baseCost, double deliveryCost) {

        return baseCost;
    }
}