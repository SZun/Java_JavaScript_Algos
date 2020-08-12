package com.zun;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        final String prompt = "Profit is: ";

        System.out.println(prompt + new Item(new BigDecimal("32.67"), new BigDecimal("45.0"), new BigDecimal(1200)).getProfit());
        System.out.println(prompt + new Item(new BigDecimal("225.89"), new BigDecimal("550.0"), new BigDecimal(100)).getProfit());
        System.out.println(prompt + new Item(new BigDecimal("2.77"), new BigDecimal("7.95"), new BigDecimal(8500)).getProfit());
    }

    public static class  Item {

        private final BigDecimal cost;

        private final BigDecimal price;

        private final BigDecimal inventory;

        public Item(BigDecimal cost, BigDecimal price, BigDecimal inventory) {
            this.cost = cost;
            this.price = price;
            this.inventory = inventory;
        }

        public BigDecimal getProfit(){
            BigDecimal perItemProfit = price.subtract(cost);
            BigDecimal profit = inventory.multiply(perItemProfit);
            return profit.setScale(0, RoundingMode.HALF_UP);
        }
    }
}
