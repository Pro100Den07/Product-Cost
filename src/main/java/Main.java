import models.Product;
import services.CalcCostBase;
import services.CalcCostDelivery;
import constants.Constants;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("abc", 5, 2.5);

        double baseCost = CalcCostBase.calculate(product);
        double totalCost = CalcCostDelivery.calculate(baseCost, Constants.DELIVERY_COST);

        System.out.printf("Product: %s, quota is %d pcs., price is EUR %.2f.%n",
                product.getName(), product.getQuantity(), product.getPrice());
        System.out.printf("Base Cost is EUR %.2f.%n", baseCost);
        System.out.printf("Total Cost is EUR %.2f.%n", totalCost);
    }
}