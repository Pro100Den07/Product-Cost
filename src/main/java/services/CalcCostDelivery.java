package services;

public class CalcCostDelivery extends CalcCostBase {
    public static double calculate(double baseCost, double deliveryCost) {
        return baseCost + deliveryCost;
    }
}